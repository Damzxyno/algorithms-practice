package linkedlists.linked_list_generator;

import lombok.ToString;

@ToString
public class LinkedList <T>{
    public T value;
    public LinkedList<T> next;
    LinkedList (T value){
        this.value = value;
    }

    LinkedList (T value, LinkedList<T> next){
        this.value = value;
        this.next = next;
    }
}