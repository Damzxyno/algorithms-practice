package linkedlists;

import linkedlists.linked_list_generator.GenerateLinkedList;
import linkedlists.linked_list_generator.LinkedList;

public class FINDKTH {
    public static void main(String[] args) {
        GenerateLinkedList<Integer> numbers = new GenerateLinkedList<>(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(getKthFromEnd(null, 7));
    }

    public static int getKthFromEnd(LinkedList<Integer> list, int KthTerm){
        LinkedList<Integer> current = list;
        int count = 0;
        LinkedList<Integer> currentKth = null;

        while (current != null){
            count++;
            if (count == KthTerm) {
                currentKth = list;
            } else if (count > KthTerm){
                currentKth = currentKth.next;
            }
            current = current.next;
        }

        return currentKth != null ? currentKth.value : -1;
    }
}
