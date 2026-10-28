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
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode root) {

        // Base case
        if (root == null) {
            return 0;
        }

        // Calculate the heights of both subtrees
        int left = height(root.left);
        int right = height(root.right);

        // Calculate the diameter passing through this node
        diameter = Math.max(diameter, left + right);

        // Return the height to the parent
        return 1 + Math.max(left, right);
    }
}