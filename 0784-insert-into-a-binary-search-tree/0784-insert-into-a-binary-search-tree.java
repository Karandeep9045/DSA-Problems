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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return bst(root,val);
    }
    public static TreeNode bst(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(val < root.val){
           root.left =  bst(root.left,val);
        }else{
            root.right = bst(root.right,val);
        }
        return root;
    }
}