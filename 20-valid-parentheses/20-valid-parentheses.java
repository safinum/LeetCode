class Solution {
    public boolean isValid(String s) {
        if (s.length()%2 != 0) return false;
        int count = 0;
        String pat1 = "()";
        String pat2 = "[]";
        String pat3 = "{}";
        
        int p = s.length()/2; 
        int x = s.length();
        
        while (s.length() > 0) {
            if (s.contains(pat1) == false && s.contains(pat2) == false && s.contains(pat3) == false) {
                return false;
                
            } else {
                if (s.contains(pat1)) { 
                    int z = s.length();
                    s = s.replace(pat1, "");
                    count = count + (z-s.length())/2;
                }
                if (s.contains(pat2)) {
                    int z = s.length();
                    s = s.replace(pat2, "");
                    count = count + (z-s.length())/2;
                }
                if (s.contains(pat3)) {
                    int z = s.length();
                    s = s.replace(pat3, "");
                    count = count + (z-s.length())/2;
                }
            }
        }
        
        if (count == x/2) return true;
        else return false;
    }
}