package linkedlists;

import linkedlists.linked_list_generator.GenerateLinkedList;
import linkedlists.linked_list_generator.LinkedList;


public class MergeLinkedListPractice {
    public static void main(String[] args) {
        GenerateLinkedList<Integer> odd = new GenerateLinkedList<>(1, 3, 7);
        GenerateLinkedList<Integer> even = new GenerateLinkedList<>(2, 4, 8, 10);
        LinkedList<Integer> oddHead = odd.getHead();
        LinkedList<Integer> evenHead = even.getHead();

        System.out.println(mergeList(oddHead, evenHead));
    }


    public static LinkedList<Integer> mergeList(LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> result = null;
        LinkedList<Integer> resultTail = null;
        LinkedList<Integer> list1Current = list1;
        LinkedList<Integer> list2Current = list2;

        while (true){
            System.out.println(result);
            if (list1Current.value == null) {
                resultTail.next = list2Current;
                list2Current = null;
            } else if (list2Current.value == null) {
                result.next = list1Current;
                list1Current = null;
            } else if (list1Current.value < list2Current.value){
                if (result == null) result = resultTail = list1Current;
                else resultTail.next = list1Current;
                list1Current = list1Current.next;
                resultTail.next = null;
            } else if (list2Current.value < list1Current.value){
                if (result == null) result = resultTail = list2Current;
                else resultTail.next = list2Current;
                list2Current = list2Current.next;
                resultTail.next = null;
            }

            if (list1Current == null && list2Current == null) break;
        }

        return result;
    }
}
