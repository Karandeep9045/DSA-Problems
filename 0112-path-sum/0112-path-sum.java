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
    public boolean hasPathSum(TreeNode root, int target) {
        return tree(root, target);
    }

    public static boolean tree(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && target - root.val == 0) {
            return true;
        }
        boolean b1 = tree(root.left, target - root.val);
        boolean b2 = tree(root.right, target - root.val);
        return b1 || b2;
    }
}