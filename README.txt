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

deleteSubsection function:

    The function checks to see if the list is empty, if so does nothing. Otherwise, it
    finds the node right before where the lower bound would reach. So if the bound is 10, it will always
    sit on the node right before ten (or the number closest to it). Then from there we find the upper bound node
    and sit on the one right after it (which could be null). From there we connect front from the lower bound (prev) and back
    from the upper bound (loc). I have a lot of checks for if the subsection is in the very front or very back.
    the function is O(n) as it is only ever in one while loop.

            if (head != null) {
            while (lower.compareTo(pred.next.info) > 0 && lower.compareTo(pred.next.info) != 0) {
                pred = pred.next;
                loc = pred;
                if (pred.next == null && lower.compareTo(pred.info) > 0) {
                    pred = pred.next;
                    break;
                } else if (pred.next == null) {
                    break;
                } // else if
            } // while
            while (upper.compareTo(loc.info) > 0 || upper.compareTo(loc.info) == 0) {
                loc = loc.next;
                if (loc == null) {
                    break;
                } // if
            } // while
            if (pred != null && (lower.compareTo(pred.info) == 0 || lower.compareTo(pred.info) < 0)) {
                if (loc != null) {
                    head = loc;
                    loc.back = null;
                } else {
                    head = null;
                } // else
            } else if (pred != null) {
                pred.next = loc;
                if (loc != null) {
                    loc.back = pred;
                } //if
            } // else if
        } // if

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

swapAlternate function:

    This function has two nodes that track down the list and swap the two nodes
    that they are on. They swap their next's and back's. There are a few special cases where you
    have to watch the end and begining, but other than that it is a pretty simple move and swap.
    This function has a O(n) because of its one while loop.

            if (length() > 1) {
            loc = head.next;
            pred = head;
            head = loc;
            while (loc != null) {
                loc.back = pred.back;
                pred.next = loc.next;
                pred.back = loc;
                loc.next = pred;
                if (pred.next == null) {
                    break;
                } // if
                if (pred.next.next == null) {
                    pred.next.back = pred;
                    break;
                } // if
                pred.next.back = pred;
                pred = pred.next;
                loc = pred.next;
                pred.back.next = loc;
            } // while
        } // if
