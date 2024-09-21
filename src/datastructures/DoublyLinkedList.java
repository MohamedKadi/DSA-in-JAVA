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
            length--;
        }else{
            tail = tail.prev;
            temp.prev = null;
            tail.next = null;
            length--;
        }

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

    public Nodev2 removeFirst(){
        Nodev2 temp = head;
        if(head == null){
            return null;
        }
        if(length == 1){
            head = null;
            tail = null;
            length--;
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
            length--;
        }

        return temp;
    }

    public Nodev2 get(int index){
        if(length < 0 || length < index || head == null){
            return null;
        }
        Nodev2 temp = head;
        int count = 0;
        while(temp != null && count < index){
            count++;
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        if(length < 0 || length < index || head == null){
            return false;
        }
        Nodev2 temp = get(index);
        temp.setValue(value);
        return true;
    }

    public boolean insert(int index, int value){
        Nodev2 newNode = new Nodev2(value);
        if(length < 0 || length < index){
            return false;
        }

        if(index == length){
            append(value);
            return true;
        }
        if(index == 0){
            prepend(value);
            return true;
        }
        Nodev2 temp = head;
        for(int i =0; i < index-1;i++){
            temp = temp.next;
        }
        Nodev2 after = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = after;
        after.prev = newNode;
        length++;
        return true;
    }

    public Nodev2 removeAt(int index){
        if(length < 0 || length <= index){
            return null;
        }
        if(index+1 == length){
            return removeLast();
        }
        if(index == 0){
            return removeFirst();
        }
        Nodev2 temp = head;
        for(int i =0; i < index-1;i++){
            temp = temp.next;
        }
        Nodev2 after = temp.next.next;
        Nodev2 deleted = temp.next;

        temp.next = after;
        after.prev = temp;
        deleted.prev = null;
        deleted.next = null;
        length--;

        return deleted;
    }
}
