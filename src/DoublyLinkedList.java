package cs2720;

import cs2720.NodeType;

/**
   Doubly Linked List class with all implemented methods.
 */
public class DoublyLinkedList<T extends Comparable<T>> {

    private NodeType<T> head;

    /**
       Makes a new Doubly Linked List.
    */
    public DoublyLinkedList() {
    } // DoublyLinkedList

    /**
       Gets the length of the Linked List.
       @return length the length of the Linked list.
     */
    public int length() {
        int length = 0;
        if (head == null) {
            return 0;
        } else {
            length++;
            NodeType<T> node = head;
            while (node.next != null) {
                node = node.next;
                length++;
            } // while
        } // else
        return length;
    } // length

    /**
       Prints the list.
     */
    public void printList() {
        if (head == null) {
            System.out.print("\n");
        } else {
            NodeType<T> node = head;
            System.out.print(node.info);
            while (node.next != null) {
                node = node.next;
                System.out.print(" " + node.info);
            } // while
            System.out.print("\n");
        } // else
    } // print




} // DoublyLinkedList
