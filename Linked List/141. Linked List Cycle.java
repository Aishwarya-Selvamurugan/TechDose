public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> h = new HashSet<>();
        while(head!=null)
        {
            if(h.contains(head))
            {
                return true;
            }
            h.add(head);
            head = head.next;
        }
        return false;
    }
}

/*
    Time complexity: O(n). 
    Only one traversal of the loop is needed.
    Auxiliary Space: O(n). 
    n is the space required to store the value in hashmap.
*/

/*Floyd’s Cycle-Finding Algorithm (This is the fastest method)
TC : Time complexity: O(n). 
Only one traversal of the loop is needed.
Auxiliary Space:O(1). 
*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head,fast = head;
        while(slow !=null && fast != null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }
}
