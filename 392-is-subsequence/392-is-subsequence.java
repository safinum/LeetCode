class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")) return true;
        int l = 0;
        
        for (int i = 0; i < t.length(); i++) {
            if (l == s.length()) return true;
            if (t.charAt(i) == s.charAt(l)) l++;
        }
        
        if (l == s.length()) return true;
        else return false;
    }
}