class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    public boolean isValid(TreeNode root,int max,int min) {
        if(root == null)
        {
            return true;
        }
        else if(root.val < min || root.val > max)
        {
            return false;
        }
        return isValid(root.left,root.val,min) && isValid(root.right,max,root.val);
    }
}
