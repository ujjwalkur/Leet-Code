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
        
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root == null){
            return result;
        }
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            
            List<Integer> templist = new LinkedList<>();
            
            for(int i = 0; i < levelsize; i++){
                
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                
                templist.add(queue.poll().val);
            }
            result.add(templist);
        }
        return result;
    }
}