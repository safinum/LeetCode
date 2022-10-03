class Solution {
    public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];
        int n = 0;
        
        for (int i = 0; i < boxes.length(); i++) {
            for (int j = 0; j < boxes.length(); j++) {
                if (j != i) {
                    if (boxes.charAt(j) == '0') {
                        continue;
                    }
                    if (boxes.charAt(j) == '1' && j < i) {
                        n += i - j;
                    }
                    if (boxes.charAt(j) == '1' && j > i) {
                        n += j - i;
                    }
                }
            }
            answer[i] = n;
            n = 0;
        }
        
        return answer;
    }
}