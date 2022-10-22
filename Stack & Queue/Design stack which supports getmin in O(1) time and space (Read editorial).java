class MinStack {
    Stack<Integer> s = new Stack<>();
    int min = Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(s.isEmpty())
        {
            min = val;
            s.push(val);
        }
        else
        {
            if(val < min)
            {
                s.push(val*2-min);
                min = val;
            }
            else
            {
                s.push(val);
            }
        }
    }
    public void pop() {
        if(s.isEmpty()) System.out.println("Empty");
      return;
        if(s.peek() < min)
        {
            min = (min*2-s.pop());
        }
        else
        {
            s.pop();
        }
    }
    public void top() {
      if(s.isEmpty()) System.out.println("Empty");
      return;
        int t=  s.peek()<min ? (min):s.peek();
      System.out.println(t);
    }
    
    public void getMin() {
      if(s.isEmpty()) System.out.println("Empty");
      return;
      System.out.println(min);
    }
}
