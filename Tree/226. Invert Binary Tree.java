class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    public void invert(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        invert(root.right);
        invert(root.left);
    }
}
