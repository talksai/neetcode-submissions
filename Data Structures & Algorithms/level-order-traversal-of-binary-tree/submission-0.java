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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> treeNodes = new ArrayDeque<>();
        if(root == null)
            return res;
        treeNodes.offer(root);
        while (!treeNodes.isEmpty()){
            List<Integer> list = new ArrayList<>();
            Queue<TreeNode> treeNodes1 = new ArrayDeque<>();
            while (!treeNodes.isEmpty()){
                TreeNode poll = treeNodes.poll();
                list.add(poll.val);
                if(poll.left !=null) 
                    treeNodes1.add( poll.left);
                if(poll.right !=null) 
                    treeNodes1.add(poll.right);
            }
            res.add(list);
            treeNodes.addAll(treeNodes1);
        }
        return res;
    }
}
