/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node == null) {
            return null;
        }

        if(map.containsKey(node)) { // prevents the re-cloning
        // if the node was already cloned, return the clone
            return map.get(node);
        }

        Node copied = new Node(node.val);
        map.put(node, copied); // save the copied nodes we've seen so far

        for(Node neighbor : node.neighbors) {
            copied.neighbors.add(cloneGraph(neighbor));
        }

        return copied;
    }
}