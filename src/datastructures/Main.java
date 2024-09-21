package datastructures;


public class Main {

    public static void main(String[] args) {

        //LinkedList myLinkedList = new LinkedList(1);
        LinkedListV2 myLinkedList = new LinkedListV2(1);
        myLinkedList.append(0);
        myLinkedList.append(0);
        myLinkedList.append(1);

        System.out.println(myLinkedList.binaryToDecimal());



        /*
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        Node result = myLinkedList.findKthFromEnd(2); // Output: Node with value 4
        System.out.println(result.getValue());
        result = myLinkedList.findKthFromEnd(5); // Output: Node with value 1
        System.out.println(result.getValue());
        result = myLinkedList.findKthFromEnd(6); // Output: null
        System.out.println(result);

         */



        /*
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        // create a loop by connecting the tail to the second node
        myLinkedList.getTail().next = myLinkedList.getHead().next;


        System.out.println("Has Loop:");
        System.out.println(myLinkedList.hasLoop());

            EXPECTED OUTPUT:
            ----------------
            Has Loop:
            true

        */

        /*
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        Node middleNode = myLinkedList.findMiddleNode();
        System.out.println(middleNode.getValue()); // Output: 3

        myLinkedList.append(6);
        middleNode = myLinkedList.findMiddleNode();
        System.out.println(middleNode.getValue()); // Output: 4
        */

        /*
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        System.out.println("LL before reverse():");
        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLL after reverse():");
        myLinkedList.printList();
         */
        /*
            EXPECTED OUTPUT:
            ----------------
            LL before reverse():
            1
            2
            3
            4

            LL after reverse():
            4
            3
            2
            1

        */









        /*
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("LL before remove():");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).getValue());
        System.out.println("LL after remove() in middle:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(0).getValue());
        System.out.println("LL after remove() of first node:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).getValue());
        System.out.println("LL after remove() of last node:");
        myLinkedList.printList();

         */
        /*
            EXPECTED OUTPUT:
            ----------------
            LL before remove():
            1
            2
            3
            4
            5

            Removed node:
            3
            LL after remove() in middle:
            1
            2
            4
            5

            Removed node:
            1
            LL after remove() of first node:
            2
            4
            5

            Removed node:
            5
            LL after remove() of last node:
            2
            4

        */


        /*
        myLinkedList.append(3);

        System.out.println("LL before insert():");
        myLinkedList.printList();

        myLinkedList.insert(1, 2);

        System.out.println("\nLL after insert(2) in middle:");
        myLinkedList.printList();

        myLinkedList.insert(0, 0);

        System.out.println("\nLL after insert(0) at beginning:");
        myLinkedList.printList();

        myLinkedList.insert(4, 4);

        System.out.println("\nLL after insert(4) at end:");
        myLinkedList.printList();

         */
        /*
            EXPECTED OUTPUT:
            ----------------
            LL before insert():
            1
            3

            LL after insert(2) in middle:
            1
            2
            3

            LL after insert(0) at beginning:
            0
            1
            2
            3

            LL after insert(4) at end:
            0
            1
            2
            3
            4

        */


        /*
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println("Linked List before set():");
        myLinkedList.printList();

        myLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList.printList();

         */
        /*
            EXPECTED OUTPUT:
            ----------------
            Linked List before set():
            0
            1
            2
            3

            Linked List after set():
            0
            1
            99
            3

        */


        /*
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);


        System.out.println(myLinkedList.get(0).getValue());
        System.out.println(myLinkedList.get(1).getValue());
        System.out.println(myLinkedList.get(2).getValue());
        System.out.println(myLinkedList.get(3).getValue());
         */
        /*
            EXPECTED OUTPUT:
            ----------------
            3

        */


        /*
        myLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().getValue());
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().getValue());
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());

         */
        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */


        /*
        myLinkedList.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

         */
         /*
            EXPECTED OUTPUT:

            Before prepend():
            -----------------
            Head: 2
            Tail: 3
            Length: 2

            Linked List:
            2
            3


            After prepend():
            ----------------
            Head: 1
            Tail: 3
            Length: 3

            Linked List:
            1
            2
            3

        */

        /*
        myLinkedList.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().getValue());
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().getValue());
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());
        */

        /*
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
        */
        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4

        */
    }
}
