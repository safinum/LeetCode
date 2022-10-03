class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        
        for (String w : words) {
            int boo = 0;
            for (int i = 0; i < w.length(); i++) {
                String all = Character.toString(w.charAt(i));
                if (allowed.contains(all)) {
                    boo++;
                }
            }
            
            if (boo == w.length()) {
                count++;
            }
        }
        
        return count;
    }
}