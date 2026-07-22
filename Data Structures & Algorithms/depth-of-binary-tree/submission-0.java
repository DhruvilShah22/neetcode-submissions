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
    private int maxi;
    public int maxDepth(TreeNode root) {
        maxi = 0;
        checkDepth(root, maxi);
        return maxi;
    }

    private void checkDepth(TreeNode root, int count){
        if(root == null){
            maxi = Math.max(maxi, count);
            return;
        }
        count ++;
        checkDepth(root.left, count);
        checkDepth(root.right, count);
    }
}
