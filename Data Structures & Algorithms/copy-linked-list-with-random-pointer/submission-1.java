/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(null == head){
            return head;
        }
        Map<Node, Node> map = new HashMap<>();
        Node start = new Node(head.val);
        map.put(head, start);
        start = addNode(null, head, map);
        map.put(head, start);
        Node current = start.next;
        head = head.next;
        while(head != null){
            current = addNode(current, head, map).next;
            head = head.next;
        }
        return start;
    }

    public Node addNode(Node current, Node head, Map<Node, Node> map ){
        current = map.getOrDefault(head, new Node(head.val));
        current.next = map.getOrDefault(head.next, head.next != null ? new Node(head.next.val) : null);
        map.put(head.next, current.next);
        current.random = map.getOrDefault(head.random, head.random != null ? new Node(head.random.val) : null);
        map.put(head.random, current.random);
        return current;
    }
}
