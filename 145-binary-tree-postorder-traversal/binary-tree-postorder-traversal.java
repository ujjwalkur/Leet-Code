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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> list = new LinkedList<>();
        TreeNode cur = root;
        TreeNode temp = null;
        
        if(root == null){
            return list;
        }
        while(cur != null || !stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            else{
                temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    list.add(temp.val);
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        list.add(temp.val);    
                    }
                }
                else{
                    cur = temp;
                }
            }
        }
        return list;
    }
}






