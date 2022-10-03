/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        return makeTree(l, r, nums);
    }
    public TreeNode makeTree (int l, int r, int[] nums) {
        if (l > r) return null;
        int m = (l + r)/2;
        TreeNode root = new TreeNode();
        root.val = nums[m];
        root.left = makeTree(l, m-1, nums);
        root.right = makeTree(m+1, r, nums);
        return root;
    }
}