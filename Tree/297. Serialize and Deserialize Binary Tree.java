public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String res = Srialize(root);
        System.out.println(res);
        return res;
    }
    public String Srialize(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp = q.remove();
                if(temp != null)
                {
                    q.add(temp.left);
                    q.add(temp.right);
                    sb.append(temp.val+" ");
                }
                else{
                sb.append("null ");
                }
            }
        }
        System.out.println(sb);
        return sb.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("null"))
        {
            return null;
        }
        return Dserialize(data);
    }
    public TreeNode Dserialize(String data)
    {
        Queue<TreeNode> q = new LinkedList<>();
        String[] s = data.split(" ");
        int i = 0;
        TreeNode root = Node1(s,i++);
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i1=0;i1<size;i1++)
            {
                TreeNode temp = q.poll();
                temp.left = Node1(s,i++);
                temp.right = Node1(s,i++);
                if(temp.left != null)
                {
                    q.add(temp.left);
                }
                if(temp.right != null)
                {
                    q.add(temp.right);
                }
            }
        }
        return root;
    }
    public TreeNode Node1(String[] s,int index)
    {
        if(index >= s.length || s[index].equals("null") || s[index].equals(""))
        {
            return null;
        }
        return new TreeNode(Integer.parseInt(s[index]));
    }
}
