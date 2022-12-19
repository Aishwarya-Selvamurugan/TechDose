class Solution {
    List<Integer> res = new ArrayList<>();
    GNode G_target = null;
    List<Integer> visited = new ArrayList<>();
    class GNode {
        int val;
        List<GNode> neighbours;
        GNode(int x)
        {
            val = x;
            neighbours = new ArrayList<>();
        }
    };
    public GNode Graph(TreeNode root,GNode parent,TreeNode target)
    {
        GNode n = new GNode(root.val);
        if(n.val == target.val)
        {
            G_target = n;
        }
        if(parent != null)
        {
            n.neighbours.add(parent);
        }
        if(root.left != null)
        {
            n.neighbours.add(Graph(root.left,n,target));
        }
        if(root.right != null)
        {
            n.neighbours.add(Graph(root.right,n,target));
        }
        return n;
    }
    public void DFS(GNode n,int k)
    {
        if(visited.contains(n.val))
        {
            return;
        }
        visited.add(n.val);
        if(k==0)
        {
            res.add(n.val);
            return;
        }
        for(GNode neighbour:n.neighbours)
        {
            DFS(neighbour,k-1);
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(root == null)
        {
            return res;
        }
        Graph(root,null,target);
        DFS(G_target,k);
        return res;
    }
    
}
