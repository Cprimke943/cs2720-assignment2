package cs2720;

import cs2720.NodeType;
import cs2720.DoublyLinkedList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
   Doubly Linked List Driver.
 */
public class DoublyLinkedListDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String type;
        String com;
        String inputS;
        int inputI;
        Double inputD;

        System.out.print("Enter list type (i - int, d - double, s - string): ");

        while (true) {

            type = sc.next();

            /*
            if (type.equals("i")) {
                DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
                break;
            } // i : Integer

            else if (type.equals("d")) {
                DoublyLinkedList<Double> list = new DoublyLinkedList<Double>();
                break;
            } // d : Double

            else if (type.equals("s")) {
                DoublyLinkedList<String> list = new DoublyLinkedList<String>();
                break;
            } // s : String
            */
            if (type.equals("s") || type.equals("i") || type.equals("d"))
                break;
            else
                System.out.print("Please enter a proper type (i - int, d - double, s - string): ");
             // no proper command input

        } // type of list : while

        if (type.equals("i")) {
            DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
            break;
        } // i : Integer

        else if (type.equals("d")) {
            DoublyLinkedList<Double> list = new DoublyLinkedList<Double>();
            break;
        } // d : Double

        else if (type.equals("s")) {
            DoublyLinkedList<String> list = new DoublyLinkedList<String>();
            break;
        } // s : String


        System.out.println("Commands:");
        System.out.println("(i) - Insert value");
        System.out.println("(d) - Delete value");
        System.out.println("(p) - Print list");
        System.out.println("(l) - Length");
        System.out.println("(t) - Print reverse");
        System.out.println("(r) - Reverse list");
        System.out.println("(b) - Delete Subsection");
        System.out.println("(s) - Swaps Alternate");
        System.out.println("(q) - Quit program" + "\n");

        System.out.print("Enter a command: ");

        while (true) {

            com = sc.next();

            if (com.equals("i")) {
                list.print();
                if (type.equals("s")) {
                    System.out.print("Enter a string to insert: ");
                    inputS = sc.next();
                    try {
                        list.insert(inputS);
                    } catch (IllegalStateException e) {
                        System.out.println(e);
                    } // try catch
                } else {
                    System.out.print("Enter a number to insert: ");
                    if (type.equals("d")) {
                        inputD = sc.nextDouble();
                        try {
                            list.insert(inputD);
                        } catch (IllegalStateException e) {
                            System.out.println(e);
                        } // try catch
                    } else {
                        inputI = sc.nextInt();
                        try {
                            list.insert(inputI);
                        } catch (IllegalStateException e) {
                            System.out.println(e);
                        } // try catch
                    } // else
                } // else
                list.print();
                list.printReverse();
                System.out.print("Enter a command: ");
            } // if : command i : Insert value

            else if (com.equals("d")) {

                System.out.print("Enter a command: ");
            } // if : command d : Delete value

            else if (com.equals("p")) {
                list.printList();
                System.out.print("Enter a command: ");
            } // if : command p : Print list : done

            else if (com.equals("l")) {
                System.out.println("The length of the list is " + list.length());
                System.out.print("Enter a command: ");
            } // if : command l : Length : done

            else if (com.equals("t")) {
                list.printReverse();
                System.out.print("Enter a command: ");
            } // if : command t : Print reverse : done

            else if (com.equals("r")) {

                System.out.print("Enter a command: ");
            } // if : command r : Reverse list

            else if (com.equals("b")) {

                System.out.print("Enter a command: ");
            } // if : command b : Delete Subsection

            else if (com.equals("s")) {

                System.out.print("Enter a command: ");
            } // if : command s : Swap Alternate

            else if (com.equals("q")) {
                System.out.println("Exiting the program...");
                break;
            } // if : command q : quit : done

            else {
                System.out.print("Invalid command try again: " );
            } // else : invalid command : done

        } // command loop : while

    } // main
} // DoublyLinkedListDriver
