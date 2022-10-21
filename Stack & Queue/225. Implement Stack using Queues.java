/*
PUSH -> O(N)
POP -> O(1)
*/

class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        if(q1.isEmpty())
        {
            q1.add(x);
        }
        else
        {
            while(!q1.isEmpty())
            {
                q2.add(q1.peek());
                q1.remove();
            }
            q1.add(x);
            while(!q2.isEmpty())
            {
                q1.add(q2.peek());
                q2.remove();
            }
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/*
===================================================================================================================================
===================================================================================================================================
PUSH -> O(1)
POP -> O(N)
*/

class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int top;
    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);
        top = x;
    }
    
    public int pop() {
        while(q1.size() > 1)
        {
            q2.add(q1.peek());
            q1.remove();
        }
        int temp=0;
        q1.remove();
        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            temp = q2.remove();
        }
        int t = temp;
        temp = top;
        top = t;
        return temp;
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
