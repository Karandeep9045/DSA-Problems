/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;.01
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
    public int sumNumbers(TreeNode root) {
        int result = 0;
        return tree(root, result);
    }

    public static int tree(TreeNode root, int result) {
        if (root == null){
            return 0;
        }
        result  = result *10+ root.val;
        if (root.left == null && root.right == null) {
            return result;
        }
        int r1 = tree(root.left, result);
        int r2 = tree(root.right, result);
        return r1+r2;
    }
}