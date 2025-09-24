class LRUCache {
    class Node{
        int val;
        int key;
        Node prev;
        Node next;
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    Map<Integer, Node> map;
    Node head;
    Node tail;
    int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0, 0);
        this.tail = new Node(0,0);
        this.head.next = tail;
        this.tail.prev = head;
    }

    public void insert(Node n) {
        n.prev = head;
        n.next = head.next;
        head.next.prev = n;
        head.next = n;
    }

    public void remove(Node n){
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node n = map.get(key);
        remove(n);
        insert(n);
        return n.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){ // if key exists -> update the value of the key
            Node n = map.get(key);
            remove(n);
        }
        Node n = new Node(key, value);
        map.put(key, n);
        insert(n);
        if(map.size() > cap) {
            Node last = tail.prev;
            remove(last);
            map.remove(last.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */