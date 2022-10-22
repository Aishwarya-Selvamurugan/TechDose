class MinStack {
    Stack<Long> s = new Stack<>();
    long min = Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(s.isEmpty())
        {
            min = (long)val;
            s.push((long)val);
        }
        else
        {
            if(val < min)
            {
                s.push((long)val*2-min);
                min = (long)val;
            }
            else
            {
                s.push((long)val);
            }
        }
    }
    public void pop() {
        if(s.peek() < min)
        {
            min = (min*2-s.pop());
        }
        else
        {
            s.pop();
        }
    }
    public int top() {
        return s.peek()<min ? (int)(min):s.peek().intValue();
    }
    
    public int getMin() {
        return (int)min;
    }
}
