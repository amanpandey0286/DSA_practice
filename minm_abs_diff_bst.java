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
    int prev = Integer.MAX_VALUE;  //to store the previous root value
    int minmDiff = Integer.MAX_VALUE;  //to store the minm value of the differences
    
    public int getMinimumDifference(TreeNode root) {
        inorderTraverse(root);
        return minmDiff;
    }

    public void inorderTraverse(TreeNode root){
        if(root == null){
            return ;
        }

        inorderTraverse(root.left);

        minmDiff = Math.min(minmDiff, Math.abs(root.val - prev ));
        prev = root.val; // stored the current root value for next recursive operation.

        inorderTraverse(root.right);
    }
}

//https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
