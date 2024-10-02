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
        System.out.print("The list is: ");
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

    /**
       Prints the reversed list.
     */
    public void printReverse() {
        System.out.print("The reverse list: ");
        if (head == null) {
            System.out.print("\n");
        } else {
            NodeType<T> node = head;
            while (node.next != null) {
                node = node.next;
            } // while
            System.out.print(node.info);
            while (node.back != null) {
                node = node.back;
                System.out.print(" " + node.info);
            } // while
            System.out.print("\n");
        } // else
    } // printReverse


    /**
       Inserts an item into the list according to its value.
       @param item the new item being inserted.
     */
    public void insertItem(T item) {
        NodeType<T> node = new NodeType<T>();
        node.info = item;
        node.next = null;
        node.back = null;
        NodeType<T> loc = head;
        NodeType<T> pred = null;
        if (head == null) {
            head = node;
        } else {
            while (item.compareTo(loc.info) == 1) {
                pred = loc;
                loc = loc.next;
                if (loc == null) {
                    break;
                } // if
            } // while
        } // else
        if (loc == null) {
            pred.next = node;
            node.back = pred;
        } else if (pred == null && item.compareTo(loc.info) != 0) {
            head = node;
            node.next = loc;
            loc.back = node;
        } else if (item.compareTo(loc.info) == -1) {
            pred.next = node;
            node.next = loc;
            node.back = pred;
            loc.back = node;
        } else if (item.compareTo(loc.info) == 0) {
            throw new IllegalStateException("Item already exists");
        } // else if
    } // insertItem




} // DoublyLinkedList
