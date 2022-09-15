class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode curr = node;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0)
        {
            int x,y;
            if(l1 == null)
            {
                x = 0;
            }
            else
            {
                x = l1.val;
            }
            if(l2 == null)
            {
                y = 0;
            }
            else
            {
                y = l2.val;
            }
            int sum = x +y+carry;
            if(sum > 9)
            {
                carry = 1;
                sum = sum%10;
            }
            else
            {
                carry = 0;
            }
            curr.next = new ListNode(sum);
            curr = curr.next;
            if(l1 != null)
            {
            l1 = l1.next;
            }
            if(l2!=null)
            {
            l2 = l2.next;
            }
        }
        return node.next;
    }
}
