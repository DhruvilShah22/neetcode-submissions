class Solution {
    private boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        if(null == root){
            return true;
        }
        int countLeft = doRec(root.left);
        int countRight = doRec(root.right);
        if(!flag){
            return flag;
        }

        return Math.abs(countLeft - countRight) <= 1;
    }

    public int doRec(TreeNode current){
        if(current == null){
            return 0;
        }
        else if(!flag){
            return 0;
        }
        int countLeft = doRec(current.left);
        int countRight = doRec(current.right);
        
        flag = Math.abs(countLeft - countRight) <= 1;

        return Math.max(countLeft, countRight) + 1;
    }
}
