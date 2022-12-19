class Solution {
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int l = preorder.length;
        if(l==0)
        {
            return null;
        }
        return helper(preorder,0,l-1);
    }
    public TreeNode helper(int[] preorder,int low,int high)
    {
        if(low > high || index == preorder.length)
        {
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[index++]);
        if(low == high)
        {
            return node;
        }
        int i;
        for(i=low;i<=high;i++)
        {
            if(preorder[i] > node.val)
            {
                break;
            }
        }
        node.left = helper(preorder,index,i-1);
        node.right = helper(preorder,i,high);

        return node;
    }
}
