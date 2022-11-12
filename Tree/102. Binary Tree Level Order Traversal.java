class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
        {
            return res;
        }
        BFS(root);
        return res;
    }
    public void BFS(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 1;
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode temp = q.remove();
                l.add(temp.val);
                if(temp.left != null)
                {
                    q.add(temp.left);
                }
                if(temp.right != null)
                {
                    q.add(temp.right);
                }
            }
            res.add(l);
            level++;
        }
    }
}
