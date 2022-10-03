class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("\\s|[^a-zA-Z0-9]","");
        s1 = s1.toLowerCase();
        String s2 = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }
        
        if (s1.equals(s2)) return true;
        else return false;
    }
}