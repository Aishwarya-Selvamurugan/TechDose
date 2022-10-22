class MinStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(!s1.isEmpty())
        {
            if(val < s2.peek())
            {
                s2.push(val);
            }
            else
            {
                s2.push(s2.peek());
            }
        }
        else
        {
            s2.push(val);
        }
        s1.push(val);
    }
    
    public void pop() {
        s2.pop();
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}
