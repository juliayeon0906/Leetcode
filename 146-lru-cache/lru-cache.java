class LRUCache {
    class Node{
        int key, val;
        Node prev, next;
        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Map<Integer, Node> map = new HashMap<>();
    Node head, tail;
    int cap;

    public LRUCache(int capacity) {
        cap = capacity;
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node n){
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }

    private void insert(Node n) {
        n.next = head.next;
        n.prev = head;
        head.next.prev = n;
        head.next = n;
    }

    
    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }
        Node n = map.get(key);
        remove(n);
        insert(n);
        return n.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        Node n = new Node(key, value);
        insert(n);
        map.put(key, n);
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