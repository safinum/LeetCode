class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) { 
            if (prefix == "") {
                break;
            }
            else {
                for (int j = 0; j < strs[0].length(); j++) {
                    if (strs[i].charAt(j) != strs[0].charAt(j)) {
                        prefix = prefix.substring(0, j);
                        break;
                    }
                }
            }
        }
        
        return prefix;
    }
}