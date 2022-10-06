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
