class Solution {
    public int climbStairs(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        while (arr.size() < n) {
            int first = arr.get(arr.size()-1);
            int second = arr.get(arr.size()-2);
            arr.add(first+second);
        }
        
        return arr.get(arr.size()-1);
    }
}