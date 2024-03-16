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
        List<Integer> result = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root == null){
            return result;
        }
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            
            for(int i=0; i<levelsize; i++){
                TreeNode currentNode = queue.poll();
                
                if(i == levelsize - 1){
                    result.add(currentNode.val);
                }
                
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
           
        }
        return result;
    }
}