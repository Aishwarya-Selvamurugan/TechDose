import java.util.*;

public class Main {
    static class TreeNode {
        int data;
        boolean isNull;
        TreeNode LC, RC;

        public TreeNode(int x) {
            data = x;
            LC = null;
            RC = null;
        }

        public TreeNode() {
            data = -1;
            isNull = true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        int l = s.length;
        if(s[0].equals("-")) {
            TreeNode root = new TreeNode(Integer.parseInt(s[0]));

            for (int i = 1; i < l; i++) {
                if (s[i].equals("-")) {
                    Append(root);
                } else {
                    Append(root, Integer.parseInt(s[i]));
                }
            }
            preorder(root);
            postorder(root);
            inorder(root);
        }
    }
    public static void Append(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);

        while(!q.isEmpty()) {
            TreeNode u = q.poll();

            if(u.LC == null) {
                u.LC = new TreeNode();
                break;
            }

            if(u.RC == null) {
                u.RC = new TreeNode();
                break;
            }

            if(!u.LC.isNull)
                q.offer(u.LC);

            if(!u.RC.isNull)
                q.offer(u.RC);
        }
    }
    public static void Append(TreeNode root,int x)
    {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);

        while(!q.isEmpty()) {
            TreeNode u = q.poll();

            if(u.LC == null) {
                u.LC = new TreeNode(x);
                break;
            }

            if(u.RC == null) {
                u.RC = new TreeNode(x);
                break;
            }

            if(!u.LC.isNull)
                q.offer(u.LC);

            if(!u.RC.isNull)
                q.offer(u.RC);
        }
    }

    public static void preorder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        if(root.data != -1) {
            System.out.println(root.data);
        }
        preorder(root.LC);
        preorder(root.RC);
    }
    public static void postorder(TreeNode root)
    {
        if(root == null) {
            return;
        }
        postorder(root.LC);
        postorder(root.RC);
        if(root.data != -1) {
            System.out.println(root.data);
        }
    }
    public static void inorder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        if(root.data != -1) {
            System.out.println(root.data);
        }
        inorder(root.LC);
        inorder(root.RC);
    }
}
