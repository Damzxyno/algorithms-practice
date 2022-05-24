package linkedlists;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public void add(int value){
        Node node = tail = new Node(value);

        if (head == null) {
            head = node;
            return;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = node;
        node.prev = current;
    }

    public void delete(int index){
        Node current = head;
        for (int i = 0; i<index; i++) current = current.next;
        Node prev = current.prev;
        Node next = current.next;
        prev.next = next;
        next.prev = prev;
        current.next = null;
        current.prev = null;
    }

    public void insert(int index, int value){
        Node current = head;
        for (int i = 0; i<index; i++) current = current.next;
        Node prev = current.prev;
        Node node = new Node(value, prev, current);
        prev.next = node;
        current.prev = node;

    }


    public void loop(){
        tranverse(Method.TRANSVERSE);
    }

    public void loopRev(){
        tranverse(Method.REVERSE);
    }

    private void tranverse(Method method){
        boolean transverses = method.equals(Method.TRANSVERSE);
        Node current = transverses ? head : tail;
        while(current != null) {
            System.out.print(current.value + " => ");
            current = transverses ? current.next : current.prev;
        }
        System.out.println(transverses ? "END" : "START");
    }

    class Node {
        int value;
        Node next;
        Node prev;

        Node (int val){
            value = val;
        }

        Node (int val, Node prev, Node next){
            value = val;
            this.prev = prev;
            this.next = next;
        }
    }

    public enum Method{REVERSE, TRANSVERSE}
}

