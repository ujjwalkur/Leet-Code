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
        
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root == null){
            return result;
        }
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int NodeSize = queue.size();
            
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0; i<NodeSize; i++){
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            
            result.add(currentLevel);
        }
        return result;
        
    }
}