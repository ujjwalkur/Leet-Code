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
    int preI = 0;
    int postI = 0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode root = new TreeNode(preorder[preI++]);

        if(root.val != postorder[postI]){
            root.left = constructFromPrePost(preorder, postorder);
        }

        if(root.val != postorder[postI]){
            root.right = constructFromPrePost(preorder, postorder);
        }

        postI++;
        return root;
    }
}