class Solution {
    int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        DFS(root,root.val);
        return count;
    }
    public void DFS(TreeNode root,int max)
    {
        if(root == null)
        {
            return;
        }
        max = Math.max(root.val,max);
        if(max == root.val)
        {
            count++;
        }
        DFS(root.left,max);
        DFS(root.right,max);
    }
}
