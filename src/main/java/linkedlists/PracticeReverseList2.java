package linkedlists;

import linkedlists.linked_list_generator.GenerateLinkedList;
import linkedlists.linked_list_generator.LinkedList;


/**
 * Practiced Today Fri-18-Mar-2022
 */

public class PracticeReverseList2 {
    public static void main(String[] args) {
        GenerateLinkedList<String> stackList = new GenerateLinkedList<>("Python", "Kotlin", "Java", "Swift");
        LinkedList<String> stackListHead = stackList.getHead();

        System.out.println(reverseLinkedList(stackListHead));

    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> head){
        LinkedList<String> newHead = null;
        LinkedList<String> current = head;

        while (current != null){
            if (newHead == null){
                newHead =current;
                current = current.next;
                newHead.next = null;
            } else {
                LinkedList<String> temp = current;
                current = current.next;
                temp.next = newHead;
                newHead = temp;
            }
        }

        return newHead;
    }


}
