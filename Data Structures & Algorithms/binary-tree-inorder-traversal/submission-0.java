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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        doRec(root.left, list);
        list.add(root.val);
        doRec(root.right, list);
        return list;
    }

    public void doRec(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        doRec(root.left, list);
        list.add(root.val);
        doRec(root.right, list);
    }
}