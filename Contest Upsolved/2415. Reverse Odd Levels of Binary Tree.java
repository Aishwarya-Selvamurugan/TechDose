class Solution {
    class Index{
        int index;
    }
    Index index = new Index();
    public TreeNode reverseOddLevels(TreeNode root) {
        ReverseOdd(root);
        return root;
    }
    void ReverseOdd(TreeNode root)
    {
        int arr[] = new int[10000000];
        storeOdd(root,arr,index,0);
        reverse(arr,index.index);
        index.index=0;
        modify(root,arr,index,0);
    }
    void reverse(int arr[],int n)
    {
        int l = 0,r = n-1;
        while(l<r)
        {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    void modify(TreeNode root,int arr[],Index index,int l)
    {
        if(root == null)
        {
            return;
        }
        modify(root.left,arr,index,l+1);
        if(l%2!=0)
        {
            root.val = arr[index.index];
            (index.index)++;
        }
        modify(root.right,arr,index,l+1);
    }
    void storeOdd(TreeNode root,int arr[],Index index,int l)
    {
        if(root == null){
            return;
        }
        storeOdd(root.left,arr,index,l+1);
        if(l%2!=0){
            arr[index.index] = root.val;
            index.index++;
        }
        storeOdd(root.right,arr,index,l+1);
    }
}
