class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n-2; i++) {
            boolean x = checkPalindrom(checkBase(Integer.toString(n), 10, i));
            if (x == false) {
                return false;
            } else continue;
        }
        return true;
    }
    
    public String checkBase (String n, int sBase, int dBase) {
        return Integer.toString(Integer.parseInt(n, sBase), dBase);
    }
    
    public boolean checkPalindrom (String n) {
        String s = "";
        for (int i = n.length()-1; i >= 0; i--) {
            s += n.charAt(i);
        }
        
        if (s.equals(n)) return true;
        else return false;
    }
}