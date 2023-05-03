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
    public int maxDepth(TreeNode root) {
         if(root == null){
             return 0;
         }
         
         int rightdepth = maxDepth(root.right);
         int leftdepth = maxDepth(root.left);

         int actualHeight = (Math.max(rightdepth, leftdepth))+1;

         return actualHeight;
    }
}

//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
