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
    public TreeNode deleteNode(TreeNode root, int key) {
        List<Integer> list = new ArrayList<>();
        boolean[] removed = new boolean[1];
        inorder(root, key, list, removed);
        return bst(list, 0, list.size() - 1);
    }

    public static void inorder(TreeNode root, int key, List<Integer> list, boolean[] removed) {

        if (root == null) {
            return;
        }
        inorder(root.left, key, list, removed);
        if (root.val == key && !removed[0]) {
            removed[0] = true;
        } else {
            list.add(root.val);
        }
        inorder(root.right, key, list, removed);
    }

    public static TreeNode bst(List<Integer> list, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = bst(list, left, mid - 1);
        root.right = bst(list, mid + 1, right);
        return root;
    }
}