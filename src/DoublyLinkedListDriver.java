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
        String inputcom;

        System.out.print("Enter list type (i - int, d - double, s - string): ");

        while (true) {

            inputcom = sc.next();

            if (inputcom.equals("i")) {
                DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
                break;
            } // i : Integer

            else if (inputcom.equals("d")) {
                DoublyLinkedList<Double> linklist = new DoublyLinkedList<Double>();
                break;
            } // d : Double

            else if (inputcom.equals("s")) {
                DoublyLinkedList<String> linklist = new DoublyLinkedList<String>();
                break;
            } // s : String

            else {
                System.out.print("Please enter a proper type (i - int, d - double, s - string): ");
            } // no proper command input

        } // type of list : while

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

            inputcom = sc.next();

            if (inputcom.equals("i")) {

                System.out.print("Enter a command: ");
            } // if : command i : Insert value

            else if (inputcom.equals("d")) {

                System.out.print("Enter a command: ");
            } // if : command d : Delete value

            else if (inputcom.equals("p")) {
                System.out.print("The list is: ");
                list.printList();
                System.out.print("Enter a command: ");
            } // if : command p : Print list

            else if (inputcom.equals("l")) {
                System.out.println("The length of the list is " + list.length());
                System.out.print("Enter a command: ");
            } // if : command l : Length

            else if (inputcom.equals("t")) {

                System.out.print("Enter a command: ");
            } // if : command t : Print reverse

            else if (inputcom.equals("r")) {

                System.out.print("Enter a command: ");
            } // if : command r : Reverse list

            else if (inputcom.equals("b")) {

                System.out.print("Enter a command: ");
            } // if : command b : Delete Subsection

            else if (inputcom.equals("s")) {

                System.out.print("Enter a command: ");
            } // if : command s : Swap Alternate

            else if (inputcom.equals("q")) {
                System.out.println("Exiting the program...");
                break;
            } // if : command q : quit

            else {
                System.out.print("Invalid command try again: " );
            } // else : invalid command

        } // command loop : while

    } // main
} // DoublyLinkedListDriver
