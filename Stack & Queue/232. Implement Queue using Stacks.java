/*
ENQUEUE -> O(N)
DEQUEUE -> O(1)
*/

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/*
===================================================================================================
ENQUEUE -> O(1)
DEQUEUE -> O(N)
*/

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int temp;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
        if(s1.size() == 1)
        {
            temp = x;
        }
    }
    
    public int pop() {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        int t = s2.pop();
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
            if(s1.size() == 1)
            {
                temp = s1.peek();
            }
        }
        return t;
    }
    
    public int peek() {
        return temp;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}
