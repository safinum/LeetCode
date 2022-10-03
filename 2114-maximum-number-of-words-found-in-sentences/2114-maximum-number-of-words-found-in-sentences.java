class Solution {
    public int mostWordsFound(String[] sentences) {
        int number = 0;
        
        for (int i = 0; i < sentences.length; i++) {
            String[] s = sentences[i].split(" ");
            int n = s.length;
            if (n > number) {
                number = n;
            }
        }
        
        return number;
    }
}