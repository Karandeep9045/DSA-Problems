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
    public int maxDepth(TreeNode root) {
        return tree(root);
    }

    public static int tree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ls = tree(root.left);
        int rs = tree(root.right);
        return Math.max(ls, rs) + 1;
    }
}