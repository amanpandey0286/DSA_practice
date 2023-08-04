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
    public int height(TreeNode root){
        if(root == null) return 0;

        return Math.max(height(root.left) , height(root.right))+1;
    }
    int maxLength = Integer.MIN_VALUE;
    int length = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        length = height(root.left) + height(root.right);
        maxLength = Math.max(maxLength, length);

        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);

        return maxLength;
    }
}

//https://leetcode.com/problems/diameter-of-binary-tree/description/
