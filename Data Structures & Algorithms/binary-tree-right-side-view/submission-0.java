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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        if(root ==null)
            return res;
        Queue<TreeNode> treeNodes = new ArrayDeque<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            Queue<TreeNode> treeNodesIn = new ArrayDeque<>(treeNodes);
            treeNodes.clear();
            while (treeNodesIn.size()>1){
                TreeNode poll = treeNodesIn.poll();
                if(poll.left !=null)
                    treeNodes.add( poll.left);
                if(poll.right !=null)
                    treeNodes.add(poll.right);
            }
            TreeNode poll = treeNodesIn.poll();
            res.add(poll.val);
            if(poll.left !=null)
                treeNodes.add( poll.left);
            if(poll.right !=null)
                treeNodes.add(poll.right);
        }
        return res;
    }
}
