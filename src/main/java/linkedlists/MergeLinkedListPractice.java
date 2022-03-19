package linkedlists;

import linkedlists.linked_list_generator.GenerateLinkedList;
import linkedlists.linked_list_generator.LinkedList;


public class MergeLinkedListPractice {
    public static void main(String[] args) {
        GenerateLinkedList<Integer> odd = new GenerateLinkedList<>(1, 3, 7, 7);
        GenerateLinkedList<Integer> even = new GenerateLinkedList<>(2, 4, 7, 8, 10);
        LinkedList<Integer> oddHead = odd.getHead();
        LinkedList<Integer> evenHead = even.getHead();

        System.out.println(mergeList(oddHead, evenHead));
    }


    public static LinkedList<Integer> mergeList(LinkedList<Integer> list1, LinkedList<Integer> list2){
        if (list1 == null && list2 == null) return null;

        LinkedList<Integer> list3;
        if (list1 == null) list3 = list2;
        else if (list2 == null) list3 = list1;

        if (list1.value < list2.value){
            list3 = list1;
            list1 = list1.next;
            list3.next = null;
        } else {
            list3 = list2;
            list2 = list2.next;
            list3.next = null;
        }

        LinkedList<Integer> list3Current = list3;

        while (list1 != null && list2 != null){
            if (list1.value < list2.value){
                list3Current.next = list1;
                list1 = list1.next;
            } else {
                list3Current.next = list2;
                list2 = list2.next;
            }
            list3Current = list3Current.next;

            if (list1 == null){
                list3Current.next = list2;
            }else if (list2 == null) {
                list3Current.next = list1;
            }
        }

        return list3;
    }
}
