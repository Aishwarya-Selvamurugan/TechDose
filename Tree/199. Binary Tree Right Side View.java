class Solution {
    List<Integer> list = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
        {
            return list;
        }
        q.add(root);
        BFS(root);
        return list;
    }
    public void BFS(TreeNode root)
    {
        while(!q.isEmpty())
        {
            TreeNode r = q.peek();
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                if(r.left != null){
                q.add(r.left);
                }
                if(r.right != null){
                q.add(r.right);
                }
                if( i == size-1)
                {
                    list.add(q.peek().val);
                }
                q.remove();
                r = q.peek();
            }
        }
    }
}
