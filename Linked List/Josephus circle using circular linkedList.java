import java.util.*;

public class LinkedList
{
    Node head = null;
    class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
            this.next = null;
        }
    }

    void add(int val)
    {
        if(head == null)
        {
            Node n = new Node(val);
            head = n;
            n.next = head;
        }
        else
        {
            Node n = new Node(val);
            Node curr = head;
            while(curr.next != head)
            {
                curr = curr.next;
            }
            curr.next = n;
            n.next = head;
        }
    }
    void display()
    {
        Node curr = head;
        if(head != null) {
            do {
                System.out.print(curr.val + " ");
                curr = curr.next;
            } while (curr != head);
        }
    }

    int josephus(int k)
    {
        Node curr = head,prev=head;
        int count = 1;
        while(curr.next != curr)
        {
            if(count == k)
            {
                System.out.println(curr.val);
                prev.next = curr.next;
                curr = curr.next;
                count = 1;
            }
            prev = curr;
            curr = curr.next;
            count++;
        }
        return curr.val;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        LinkedList l = new LinkedList();
        for(int i=1;i<=N;i++)
        {
            l.add(i);
        }
//        l.display();
        int res = l.josephus(k);
        System.out.println();
        System.out.println(res);
    }
}
