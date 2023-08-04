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
    // to find height of the tree
    int heightBST(TreeNode root){
        if(root == null) return 0;
        return Math.max(heightBST(root.left), heightBST(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(heightBST(root.left) - heightBST(root.right)) > 1 ) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}

//https://leetcode.com/problems/balanced-binary-tree/description/
