class Solution {
    public int romanToInt(String s) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                nums.add(1);
                continue;
            }
            if (s.charAt(i) == 'V') 
            {
                nums.add(5);
                continue;
            }
            if (s.charAt(i) == 'X') {
                nums.add(10);
                continue;
            }
            if (s.charAt(i) == 'L') {
                nums.add(50);
                continue;
            }
            if (s.charAt(i) == 'C') {
                nums.add(100);
                continue;
            }
            if (s.charAt(i) == 'D') {
                nums.add(500);
                continue;
            }
            if (s.charAt(i) == 'M') {
                nums.add(1000);
                continue;
            }
        }
        int res = 0;
        for (int i = 0; i < nums.size()-1; i++) {
            if (nums.get(i) < nums.get(i+1)) res = res - nums.get(i);
            else res += nums.get(i);
        }
        res += nums.get(nums.size()-1);
        return res;
    }
}