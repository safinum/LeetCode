class Solution {
    public int minPartitions(String n) {

        int output = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) > output) {
                output = n.charAt(i);
            }
        }
        
        return output - '0';
    }
}