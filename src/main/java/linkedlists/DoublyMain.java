package linkedlists;

public class DoublyMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.add(1);
        doublyLinkedList.add(5);
        doublyLinkedList.add(7);
        doublyLinkedList.add(9);
        doublyLinkedList.add(11);
        doublyLinkedList.add(13);

        doublyLinkedList.loop();
        doublyLinkedList.delete(3);
        doublyLinkedList.loop();
        doublyLinkedList.insert(3, 45);
        doublyLinkedList.loop();
        doublyLinkedList.loopRev();
    }
}
