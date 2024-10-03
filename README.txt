Caspar Primke ctp78300@uga.edu (811269434)

Compile commands:
    javac -d bin src/NodeType.java
    javac -cp bin -d bin src/DoublyLinkedList.java
    javac -cp bin -d bin src/DoublyLinkedListDriver.java

Run commands:
    java -cp bin cs2720/DoublyLinkedListDriver <file-name>

    just replace <file-name> with whatever file is called, assuiming the file
    name is int-input.txt, the command would be:

    java -cp bin cs2720/DoublyLinkedListDriver int-input.txt

reverseList function:

    The reverseList function first checks to see if the list is empty which if it is,
    it does nothing. It also does nothing if the list is only length 1, because there is no
    need to flip anything. If it passes those, it goes through the list using to temp nodes
    flipping next and back along the way. It has a check during one loop to see if it is odd or
    even which then breaks the loop and connects head to the proper node. Because of the one while
    loop in this function, this function has a O(n). It has to loop through the list at least once
    to switch each variable in the node.

        if (head != null) {
            if (length() > 1) {
                while (loc != null) {
                    if (loc.next == null) {
                        break;
                    } // if
                    pred = loc;
                    loc = loc.next;
                    pred.next = pred.back;
                    pred.back = loc;
                    loc.back = loc.next;
                    loc.next = pred;
                    pred = loc;
                    loc = loc.back;
                } // while
                if (loc == null) {
                    head = pred;
                } else {
                    loc.back = loc.next;
                    loc.next = pred;
                    head = loc;
                } // if : even length list : else : odd length list
            } // if
        } // if
