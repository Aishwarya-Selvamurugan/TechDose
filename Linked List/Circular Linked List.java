import java.util.*;
class LinkedList{
    static Node head;
    class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
            this.next = null;
        }
    }
    public void insert(int val)
    {
        if(head == null)
        {
            Node nn = new Node(val);
            head = nn;
            head.next = nn;
        }
        else {
            Node nn = new Node(val);
            Node curr = head;
            while(curr.next!=head)
            {
                curr = curr.next;
            }
            curr.next = nn;
            nn.next = head;
        }
    }
    public static void display()
    {
        Node curr = head;
        do {
            System.out.println(curr.val);
            curr = curr.next;
        }while(curr != head);
    }
    public static void delete(int index)
    {
        Node curr = head,prev = null;
        if(index == 0)
        {
            do{
                curr = curr.next;
            }while(curr.next!=head);
            head = head.next;
            curr.next = head;
            return;
        }
        while(index > 0 && curr.next!=head)
        {
            prev = curr;
            curr = curr.next;
            index--;
        }
        if(index > 0)
        {
            System.out.println("Index Out of Bound");
            return;
        }
        prev.next = curr.next;
    }
    public void insertAtpos(int index,int val)
    {
        Node curr = head;
        Node nn = new Node(val);
        if(index == 0)
        {
            nn.next = head;
            do {
                curr = curr.next;
            }while(curr.next!=head);

            head = nn;
            curr.next = head;
            return ;
        }
        index = index-1;
        while(index > 0 && curr.next != head)
        {
            curr = curr.next;
            index--;
        }
        if(index != 0)
        {
            System.out.println("Index out of Bound and appended at the end....");
        }
        nn.next = curr.next;
        curr.next = nn;

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.display();
        ll.delete(5);
        ll.insertAtpos(6,30);
        ll.display();
    }
}
