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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        tree(root, targetSum, result, list);
        return result;
    }

    public static void tree(TreeNode root, int target, List<List<Integer>> result, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null && target == root.val) {
            result.add(new ArrayList<>(list));
        } else {
            tree(root.left, target - root.val, result, list);
            tree(root.right, target - root.val, result, list);
        }

        list.remove(list.size() - 1);
    }
}