class Solution {
    public int compress(char[] chars) {
        String s = "";
        char c = Character.MIN_VALUE;
        int count = 0;
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != c && count < 2) {
                c = chars[i];
                s+= Character.toString(chars[i]);
                count = 1;
            }
            else if (chars[i] != c && count >= 2) {
                s+= Integer.toString(count);
                s+= Character.toString(chars[i]);
                c = chars[i];
                count = 1;
            }
            else if (chars[i] == c) {
                count++;
            }
        }
        if (count > 1) {
            s+= Integer.toString(count);
        }
        
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        
        return s.length();
    }
}