package linkedlists.linked_list_generator;

import lombok.ToString;

/**
 * An automated Linked list generator.
 * This class generates a linked list from parameters passed into its constructor.
 * Created by @damzxyno.
 * @param <T>
 */


@ToString
public class GenerateLinkedList <T> {
    LinkedList<T> head;
    LinkedList <T> current;

    @SafeVarargs
    public GenerateLinkedList (T... elements){
        for (T element : elements){
            LinkedList<T> newNode = new LinkedList<T>(element);
            if (head == null){
                head = current = newNode;
            } else {
                current.next =  newNode;
                current = newNode;
            }
        }
        assert current != null;
        current.next = null;
    }

    public LinkedList<T> getHead (){
        return head;
    }
}
