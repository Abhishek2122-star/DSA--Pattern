/**
 
Definition for a binary tree node.
public class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode() {}
TreeNode(int val) { this.val = val; }
TreeNode(int val, TreeNode left, TreeNode right) {
this.val = val;
this.left = left;
this.right = right;
}
}*/
class Solution {
    int ans = 0;

    public int countDominantNodes(TreeNode root) {
        solve(root);
        return ans;

    }

    public int solve(TreeNode node) {
        if(node==null){
            return 0;
        }
        int lef=solve(node.left); 
        int rig=solve(node.right); 
        int cur=node.val;

        if(cur>=lef && cur>=rig){
            ans++;
        }
        return Math.max(cur,Math.max(lef,rig));

    }
}