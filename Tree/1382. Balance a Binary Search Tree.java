class Solution {
    public TreeNode balanceBST(TreeNode root) {
        if(root == null)
        {
            return null;
        }

        List<TreeNode> l = new ArrayList<>();
        Inorder(l,root);

        return createBST(l,0,l.size()-1);

    }
    public void Inorder(List<TreeNode> l,TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        Inorder(l,root.left);
        l.add(root);
        Inorder(l,root.right);
    }
    public TreeNode createBST(List<TreeNode> l,int low,int high)
    {
        if(low <= high)
        {
            int mid = (low+high)/2;
            TreeNode node = l.get(mid);
            node.left = createBST(l,low,mid-1);
            node.right = createBST(l,mid+1,high);
            return node;
        }
        return null;
    }
}
