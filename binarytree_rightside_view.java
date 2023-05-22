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
    //fnc to add the rightside node to the list.
    void printRightViewUntil(TreeNode root, ArrayList list, int level){
        if(root==null){
            return;
        }
        // if at that level no value is stored then add it.
        if(level == list.size()){
            list.add(root.val);
        }
        printRightViewUntil(root.right, list, level + 1);
        printRightViewUntil(root.left, list, level + 1);
    }
  
    //default fnc
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        printRightViewUntil(root, list, 0);

        return list;
    }
}

//https://leetcode.com/problems/binary-tree-right-side-view/description/
