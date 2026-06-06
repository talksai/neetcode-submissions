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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        return isBalanced1(root)!=-1;
    }
    public int isBalanced1(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right==null)
            return 1;
        int l = isBalanced1( root.left);
        int r = isBalanced1( root.right);
        if(l ==-1 || r ==-1)
            return -1;
        else if(Math.abs(l-r)>1){
            return -1;
        }else {
            return Math.max(l,r)+1;
        }
    }
}
