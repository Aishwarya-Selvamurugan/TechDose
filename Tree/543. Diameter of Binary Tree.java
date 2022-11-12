class Solution {
    int m2 = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root,0);
        return m2;
    }
    public int diameter(TreeNode root,int m)
    {
        if(root == null)
        {
            return 0;
        }
        int left = diameter(root.left,m);
        int right = diameter(root.right,m);

        int max = left+right;
        int m1 = Math.max(left,right);
        m2 = Math.max(max,m2);
        return m1+1;
    }
}
