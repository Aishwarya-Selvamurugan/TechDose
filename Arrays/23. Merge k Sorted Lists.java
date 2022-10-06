/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> l = new ArrayList<>();
        int len = lists.length;
        for(int i=0;i<len;i++)
        {
            while(lists[i]!=null)
            {
                l.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(l);
        ListNode list = new ListNode(0);
        ListNode root = list;
        for(int i=0;i<l.size();i++)
        {
            root.next = new ListNode(l.get(i));
            root = root.next;
        }
        return list.next;
    }
}
//=============================================================================================//
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int l = lists.length;
        return MergeSort(lists,0,l-1);
    }
    public static ListNode MergeSort(ListNode[] lists,int low,int high)
    {
        if(low < high)
        {
            int mid = low + ((high-low)/2);
            ListNode l1 = MergeSort(lists,low,mid);
            ListNode l2 = MergeSort(lists,mid+1,high);
            return Merge(l1,l2);
        }
        return (low>high)?null:lists[low];
    }
    public static ListNode Merge(ListNode l1,ListNode l2)
    {
        ListNode l = new ListNode();
        ListNode root = l;
        while(l1 != null && l2 != null)
        {
            if(l1.val > l2.val)
            {
                l.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            else
            {
                l.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            l = l.next;
        }
        while(l1!=null)
        {
            l.next = new ListNode(l1.val);
            l1 = l1.next;
            l = l.next;
        }
        while(l2!=null)
        {
            l.next = new ListNode(l2.val);
            l2 = l2.next;
            l = l.next;
        }
        return root.next;
    }
}
