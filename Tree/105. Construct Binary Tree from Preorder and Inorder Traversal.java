class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        } 
        return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
    }
    public TreeNode helper(int[] preorder, int pStart ,int pEnd,int[] inorder,int inStart,int inEnd,Map<Integer,Integer> map)
    {
        if(pStart > pEnd || inStart > inEnd)
        {
            return null;
        }
        TreeNode node = new TreeNode(preorder[pStart]);
        int mid = map.get(node.val);
        int n = mid-inStart;

        node.left = helper(preorder,pStart+1,pStart+n,inorder,inStart,mid-1,map);
        node.right = helper(preorder,pStart+n+1,pEnd,inorder,mid+1,inEnd,map);


        return node;
    }
}
