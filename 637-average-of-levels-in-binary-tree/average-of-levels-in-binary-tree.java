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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root == null){
            return result;
    }
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int Levelsize = queue.size();
            
            double average = 0;
            for(int i = 0; i<Levelsize; i++){
                TreeNode currentNode = queue.poll();
                average += currentNode.val;
                
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            average = average / Levelsize;
            result.add(average);
        }
        return result;
    }
}