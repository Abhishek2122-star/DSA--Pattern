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
    public boolean isSymmetric(TreeNode root) {
        
        if ( root == null){
            return true ;
        }

        return isduplicate(root.left , root.right);

    }
    private boolean isduplicate(TreeNode left , TreeNode right){

        if ( left == null && right == null){
            return true ;
        }

        if ( left == null || right == null){
            return false ;
        }

        // match the both value 

        if (left.val != right.val){
            return false ;
        }

        return isduplicate(left.left , right.right) && isduplicate(left.right , right.left);
    }


}