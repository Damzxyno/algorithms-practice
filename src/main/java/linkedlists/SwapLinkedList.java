package linkedlists;

import linkedlists.linked_list_generator.GenerateLinkedList;
import linkedlists.linked_list_generator.LinkedList;

public class SwapLinkedList {
    public static void main(String[] args) {
        GenerateLinkedList<String> names = new GenerateLinkedList<>("Moses", "Demian", "Ayomide", "deen", "Emmanuel" , "Ebube");
        swap(names);
    }


    public static void swap (GenerateLinkedList<String> names){
        LinkedList<String> current = names.getHead();

        while (current != null && current.next != null){
            String firstValue = current.value;
            current.value = current.next.value;
            current.next.value = firstValue;
            current = current.next.next;
        }

        System.out.println(names.getHead());

    }
}
