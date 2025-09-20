class Node{
    int key;
    int val;
    Node prev;
    Node next;
    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {

    private Map<Integer, Node> cache;
    private Node head;
    private Node tail;
    private int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    private void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void insert(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    
    public int get(int key) {
        if(!cache.containsKey(key)) {
            return -1;
        }
        Node n = cache.get(key);
        remove(n);
        insert(n);
        return n.val;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        
        Node n = new Node(key, value);
        insert(n);
        cache.put(key, n);

        if(cache.size() > cap) {
            Node last = tail.prev;
            remove(last);
            cache.remove(last.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */