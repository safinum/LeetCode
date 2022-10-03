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
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;
        int h = height(root);
        sumOf(root, 1, h);
        return a;
    }
    
    int a = 0;
    
    public void sumOf (TreeNode root, int b, int h) {
        if (root == null) return;
        if (b == h) {
            a += root.val;
        } else {
            sumOf(root.left, b+1, h);
            sumOf(root.right, b+1, h);
        }
    }
    
    public int height (TreeNode root) {
        if (root == null) {
            return 0;
        } 
        int lH = height(root.left);
        int rH = height(root.right);
        return Math.max(lH, rH) + 1; 
    }
}