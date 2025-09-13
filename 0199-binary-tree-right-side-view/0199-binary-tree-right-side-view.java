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
    private int visited = -1;

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int level = 0;
        tree(root, list, level);
        return list;
    }

    public  void tree(TreeNode root, List<Integer> list, int level) {
        if (root == null) {
            return;
        }
        if (level > visited) {
            list.add(root.val);
            visited = level;
        }

        tree(root.right, list, level + 1);
        tree(root.left, list, level + 1);
    }
}