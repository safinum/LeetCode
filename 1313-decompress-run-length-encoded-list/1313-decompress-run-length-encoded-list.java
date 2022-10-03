class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= nums.length-2; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                arr.add(nums[i+1]);
            }
        }
        int[] n = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            n[i] = arr.get(i);
        }
        return n;
    }
}