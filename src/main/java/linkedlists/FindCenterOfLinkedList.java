package linkedlists;

import linkedlists.linked_list_generator.GenerateLinkedList;
import linkedlists.linked_list_generator.LinkedList;

public class FindCenterOfLinkedList {
    public static void main(String[] args) {
        GenerateLinkedList<String> stacks = new GenerateLinkedList<>("Java", "Python", "IOS", "Android", "DOTNET", "Node", "GoLang");
        System.out.println(stacks.getHead());
    }

//    public static String findCenterValue(LinkedList<String> stacks){
//        LinkedList<String>
//
//    }
}
