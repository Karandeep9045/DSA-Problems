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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        pre(root,list);
        return list;
    }
    public static void pre(TreeNode nn,List<Integer> list){
        if(nn == null){
            return;
        }
        list.add(nn.val);
        pre(nn.left,list);
        pre(nn.right,list);
    }
}