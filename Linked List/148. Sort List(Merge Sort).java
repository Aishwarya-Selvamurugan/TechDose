class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        
        ListNode left = head;
        ListNode right = getMid(head);
        ListNode temp = right.next;
        right.next = null;
        right = temp;
        
        left = sortList(left);
        right = sortList(right);
        
        return merge(left,right);
    }
    ListNode getMid(ListNode head)
    {
        ListNode slow = head,fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode head = new ListNode();
        ListNode curr = head;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                curr.next = l1;
                l1 = l1.next;
            }
            else
            {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        while(l1 != null)
        {
            curr.next = l1;
            l1 = l1.next;
            curr = curr.next;
            
        }
        while(l2 != null)
        {
            curr.next = l2;
            l2 = l2.next;
            curr = curr.next;
        }
        return head.next;
    }
}
