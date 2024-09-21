package datastructures;

public class DoublyLinkedList {
    Nodev2 head;
    Nodev2 tail;
    int length = 0;

    DoublyLinkedList(int value){
        Nodev2 newNode = new Nodev2(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public Nodev2 getHead(){
        return head;
    }
    public Nodev2 getTail(){
        return tail;
    }
    public void printList(){

        if(head == null){
            System.out.println("the list is empty");
        }else{
            Nodev2 temp = head;
            while(temp != null){
                System.out.println(temp.getValue());
                temp = temp.next;
            }

        }
    }

    public void append(int value){
        Nodev2 newNode = new Nodev2(value);
        length++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public Nodev2 removeLast(){
        Nodev2 temp = tail;
        if(head == null){
            return null;
        }
        if( length == 1 ){
            head=null;
            tail=null;
        }else{
            tail = tail.prev;
            temp.prev = null;
            tail.next = null;

        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Nodev2 newNode = new Nodev2(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;

    }


}
