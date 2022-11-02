import java.util.*;

class StackNode{
    int data;
    StackNode next;
    StackNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class Stack{
    StackNode top;
    void push(int data)
    {
        if(this.top == null)
        {
            top = new StackNode(data);
            return;
        }
        StackNode nn = new StackNode(data);
        nn.next = this.top;
        this.top = nn;
    }

    StackNode pop()
    {
            StackNode s = this.top;
            this.top = top.next;
            return s;
    }
    void reverse()
    {
        StackNode curr,next,prev;
        curr = next = this.top;
        prev = null;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        this.top = prev;
    }
    void display()
    {
        StackNode curr = this.top;
        while(curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.reverse();
        s.display();
    }
}
