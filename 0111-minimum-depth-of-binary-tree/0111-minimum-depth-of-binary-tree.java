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
    public int minDepth(TreeNode root) {
        return tree(root);
    }

    public static int tree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ls = tree(root.left);
        int rs = tree(root.right);
        if (root.left == null)
            return rs + 1;
        if (root.right == null)
            return ls + 1;
        return Math.min(ls, rs) + 1;
    }
}