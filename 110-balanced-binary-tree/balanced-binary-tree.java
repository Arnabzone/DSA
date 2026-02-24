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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lsubtree=height(root.left);
        int rsubtree=height(root.right);
        while(Math.abs(lsubtree-rsubtree)<=1 &&
        isBalanced(root.left) && 
        isBalanced(root.right)
        )
        {
            return true;
        }
        return false;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int lc=height(root.left);
        int rc=height(root.right);
        return Math.max(lc,rc)+1;
    }
}