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
        return isSymmetric(root, root);
    }
    
    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null){
            return true;
        }
        
        // only one of them can be null here
        if(left == null || right == null) {
            return false;
        }
        
        // both of them are not null
       return left.val == right.val && 
           isSymmetric(left.left, right.right) && 
           isSymmetric(left.right, right.left);
        
    }
}