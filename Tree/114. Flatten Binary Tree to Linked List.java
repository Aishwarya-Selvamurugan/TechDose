class Solution {
    public void flatten(TreeNode root) {
        dfs(root);
    }
    public TreeNode dfs(TreeNode root)
    {
        if(root == null)
        {
            return null;
        }
        TreeNode left = dfs(root.left);
        TreeNode right = dfs(root.right);

        if(root.left != null)
        {
            left.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        TreeNode last = root;
        if(right != null)
        {
            last = right;
        }
        else if(left != null)
        {
            last = left;
        }
        return last;
    }
}
