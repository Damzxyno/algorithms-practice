import lombok.ToString;

public class ReverseLinkedListAlgoPractice {
    @ToString
    static class Node{
        int value;
        Node next;
        Node(int value){this.value = value;}
    }


    static Node head;

    public static void setUpHead() {
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(5);

        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f; f.next = null;
        head = a;
    }

    public static void main(String[] args) {
        setUpHead();
        System.out.println(head);
        System.out.println(reverseLinkedList(head));
    }

    public static Node reverseLinkedList(Node head) {
        Node currentNode = head;  // 1, 2, 3, 4
        Node previousNode = null;

        while (currentNode != null) {
            Node intermediateNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = intermediateNode;
        }

        return previousNode;

    }

}
