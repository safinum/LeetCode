class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        ArrayList<Character> c = new ArrayList<>();
        ArrayList<String> arr = new ArrayList<>();
        
        for (int i = 0; i < chars.length(); i++) {
            c.add(chars.charAt(i));
        }
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= c.size()) arr.add(words[i]);
        }
        
        for (int i = 0; i < arr.size(); i++) {
            ArrayList x = (ArrayList)c.clone();
            int val = 0;
            for (int j = 0; j < arr.get(i).length(); j++) {
                if (x.contains(arr.get(i).charAt(j))) {
                    val++;
                    x.remove(x.indexOf(arr.get(i).charAt(j)));
                }
            }
            if (val == arr.get(i).length()) {
                count += val;
            } 
        }
        
        return count;
    }
}