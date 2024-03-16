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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root == null){
            return result;
        }
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int nodesize = queue.size();
            
            List<Integer> currentlevel = new ArrayList<>();
            for(int i=0; i<nodesize; i++){
                
                TreeNode currentNode = queue.poll();
                currentlevel.add(currentNode.val);
                
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(0, currentlevel);
        }
        return result;
    }
}