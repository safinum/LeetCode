class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(1);
        
        while (nums.size() <= n) {
            int x = nums.get(nums.size()-1) + nums.get(nums.size()-2);
            nums.add(x);
        }
        
        return nums.get(nums.size()-1);
    }
}