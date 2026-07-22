class Solution {
    private int maxi = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        checkDiameter(root);
        return maxi;
    }

    public int checkDiameter(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = checkDiameter(root.left);
        int right = checkDiameter(root.right);

        maxi = Math.max(maxi, left + right);

        return 1 + Math.max(left, right);
    }
}
