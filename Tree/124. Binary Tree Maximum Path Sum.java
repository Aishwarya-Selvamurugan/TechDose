class Solution {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        Sum(root);
        return res;
    }
    public int Sum(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int left = Sum(root.left);
        int right = Sum(root.right);
        int ms = Math.max(Math.max(right,left)+root.val,root.val);
        int ms1 = Math.max(ms,right+left+root.val);
        res = Math.max(res,ms1);
        System.out.println(res);
        return ms;
    }
}
