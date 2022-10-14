class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i-2], cost[i-1]);
        }
        return Math.min(cost[cost.length-2], cost[cost.length-1]);
    }
}