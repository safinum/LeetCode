class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        int temp = 0;
        ArrayList<String> arr = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= s.length() && words[i].charAt(0) == s.charAt(0)) {
                arr.add(words[i]);
            }
        }
        
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).length(); j++) {
                if (arr.get(i).charAt(j) != s.charAt(j)) {
                    temp = 0;
                } else {
                    temp++;
                }
            }
            if (temp == arr.get(i).length()) {
                count++;
                temp = 0;
            } else {
                temp = 0;
            }
        }
        return count;
    }
}