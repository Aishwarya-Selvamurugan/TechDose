import java.util.*;
public class Main {
    static Stack<Integer> s = new Stack<>();
    static void insert_at_bottom(int x)
    {
        if(s.isEmpty())
        {
            s.push(x);
            return;
        }
        int c = s.peek();
        s.pop();
        insert_at_bottom(x);
        s.push(c);
    }

    static void reverse()
    {
        if(s.size() > 0)
        {
            int a = s.peek();
            s.pop();
            reverse();
            insert_at_bottom(a);
        }
    }
    public static void main(String[] args) {
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        reverse();
        System.out.println(s);
    }
}