class Solution {
    class Pair{
        int d;
        TreeNode parent;
        Pair(int d,TreeNode t)
        {
            this.d = d;
            this.parent = t;
        }
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null)
        {
            return false;
        }
        Pair l = helper(root,x,null,0);
        Pair r = helper(root,y,null,0);
        
        if(l.parent == null || r.parent == null)
        {
            return false;
        }
        if((l.d == r.d) && (l.parent != r.parent))
        {
            return true;
        }
        return false;

    }
    public Pair helper(TreeNode root,int x,TreeNode p,int k)
    {
        if(root == null)
        {
            return new Pair(-1,null);
        }
        if(root.val == x)
        {
            return new Pair(k-1,p);
        }
        Pair left = helper(root.left,x,root,k+1);
        Pair right = helper(root.right,x,root,k+1);

        if(left.parent != null) return left;
        return right; 
    }
}
