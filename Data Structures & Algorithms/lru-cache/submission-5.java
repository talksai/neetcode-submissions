class LRUCache {

      private final Map<Integer,Node> cache;
    private int capacity = 0;
    Node head, tell;
    public LRUCache(int capacity) {
        cache = new HashMap<>(capacity);
        this.capacity = capacity;
        head = new Node(0,0);
        tell = new Node(0,0);
        head.next = tell;
        tell.prev = head;
    }

    public int get(int key) {
        Node node =cache.getOrDefault(key, null);
        if(node == null)
            return -1;
        remove(node);
        addFirst(node);
        return node.val;
    }
    private void addFirst(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        
    }
    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void put(int key, int value) {
        Node nodeExsiting =cache.getOrDefault(key, null);
        Node node  = new Node(key,value);
        if(nodeExsiting != null){
            remove(nodeExsiting);
        }

        if( cache.size() == capacity && nodeExsiting == null){
            Node cur = tell.prev;
            remove(cur);
            cache.remove(cur.key);
        }
        cache.put(key,node);
        addFirst(node);
    }

    private class Node{
        int val;
        int key;
        Node prev;
        Node next;

        public Node(int key, int val) {
            this.val = val;
            this.key = key;
        }
    }
}
