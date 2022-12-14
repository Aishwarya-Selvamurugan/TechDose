public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head,fast = head;
        while(slow != null && fast != null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
            {
                while(head != fast)
                {
                    head = head.next;
                    fast = fast.next;
                }
                return head;
            }
            
        }
        return null;
    }
}

/*
Time Complexity: O(N)

Space Complexity: O(1)
*/
