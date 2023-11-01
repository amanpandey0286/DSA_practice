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

    //main function.
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> modesList = new ArrayList<>();
        mainFind(root , modesList);
        int[] modes = new int [modesList.size()];
        for(int i = 0; i < modes.length; i++){
            modes[i] = modesList.get(i);
        }
        return modes;
    }

    
    Integer prev = null;// since int can't be null hence we use Integer
    int count = 1;
    int max = 0;

    //doing all operation in inorder traversal as it is BST(sorted).
    public void mainFind(TreeNode root , ArrayList<Integer> modesList){
            if(root == null) return;
      
            mainFind(root.left, modesList);
      
            if(prev != null){
                if(prev == root.val){
                    count++;
                }else{
                    count = 1;
                }
            }

            if(count > max){
                modesList.clear();
                max = count;
                modesList.add(root.val);
            }else if(count == max){
                modesList.add(root.val);
            }

            prev = root.val;


            mainFind(root.right, modesList);
    }
}

//https://leetcode.com/problems/find-mode-in-binary-search-tree/?envType=daily-question&envId=2023-11-01
