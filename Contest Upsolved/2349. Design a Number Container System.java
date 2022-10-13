class NumberContainers {
    HashMap<Integer,PriorityQueue<Integer>> q;
    HashMap<Integer,Integer> l;
    public NumberContainers() {
        q = new HashMap<>();
        l = new HashMap<>();
    }
    
    public void change(int index, int number) {
        l.put(index,number);
        if(!q.containsKey(number))
        {
            q.put(number,new PriorityQueue<>());
        }
        q.get(number).add(index);
    }
    
    public int find(int number) {
        if(!q.containsKey(number))
        {
            return -1;
        }
        PriorityQueue<Integer> pq = q.get(number);
        int z = -1;
        while(!pq.isEmpty())
        {
            int t = pq.peek();
            if(number == l.get(t))
            {
                z = t;
                break;
            }
            else
            {
                pq.poll();
            }
        }
        return z;
    }
}
