class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((node1,node2)->{return node1.val-node2.val;});
        ListNode res = new ListNode(0);
        ListNode head = res;
        for(ListNode list:lists)
        {
            if(list!=null)
            {
                q.offer(list);
            }
        }
        while(!q.isEmpty())
        {
            ListNode x = q.poll();
            res.next = new ListNode(x.val);
            res = res.next;
            x=x.next;
            if(x != null)q.offer(x);
        }
        return head.next;
    }
}
