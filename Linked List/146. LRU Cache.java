class LRUCache {
    class Node{
        int key;
        int val;
        Node prev=null;
        Node next=null;
        Node()
        {
            this.key = -1;
            this.val = -1;
        }
        Node(int key,int val)
        {
            this.key = key;
            this.val = val;
        }
    }
    int capacity;
    Node head = new Node();
    Node tail = new Node();
    Map<Integer,Node> map = new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public void remove(Node n)
    {
        Node temp = n.prev;
        temp.next = n.next;
        n.next.prev = temp;
    }
    
    public void insert(Node n)
    {
        tail.prev.next = n;
        n.prev = tail.prev;
        n.next = tail;
        tail.prev = n;
        
    }
    public int get(int key) {
        if(map.containsKey(key))
        {
            remove(map.get(key));
            insert(map.get(key));
            return map.get(key).val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        Node n = new Node(key,value);
        map.put(key,n);
        insert(map.get(key));
        if(map.size() > capacity)
        {
            map.remove(head.next.key);
            remove(head.next);
        }
    }
}
