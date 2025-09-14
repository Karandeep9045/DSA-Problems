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

// o(n)
class Solution {
    public int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        ans = Math.max(ans, lh + rh);
        return Math.max(lh, rh) + 1;
    }
}

// n*n approach 

// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         return diam(root);
//     }

//     public static int diam(TreeNode root){
//         if(root == null){
//             return 0;
//         }
//         int ld = diam(root.left);
//         int rd = diam(root.right);
//         int currd = height(root.left) + height(root.right);
//         return Math.max(ld,(Math.max(rd,currd)));
//     }
//     public static int height(TreeNode root){
//         if(root == null){
//             return 0;
//         }
//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh,rh)+1;
//     }
// }
