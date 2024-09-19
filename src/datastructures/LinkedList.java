package datastructures;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void append(int value){
        length++;
        Node appendedNode = new Node(value);
        if(head == null){
            head = appendedNode;
            tail = appendedNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = appendedNode;
            tail = appendedNode;
        }
    }
    public void makeEmpty(){
        length = 0;
        head = null;
        tail = null;
    }
    public Node removeLast(){
        if(head == null){
            return null;
        }
        Node temp = head;
        Node pre = head;

        int value = tail.getValue();
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        length++;
    }


    public void getHead(){
        System.out.println("Head: "+this.head.getValue());
    }
    public void getTail(){
        System.out.println("Tail: "+this.tail.getValue());
    }
    public void getLength(){
        System.out.println("Length: "+length);
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.getValue());
            temp = temp.next;
        }
    }

    public Node removeFirst(){
        if(length == 0){
            head = null;
            tail = null;
            return head;
        }else{
            length--;
            if (length == 0) {
                tail = null;
            }
            Node pre = head;
            head = head.next;
            pre.next = null;
            return pre;
        }

    }

    public Node get(int index){
        int count = 0;
        if(head == null && index < 0 && index> length){
            return null;
        }
        Node temp = head;
        while(temp.next!=null && count < index){
            temp=temp.next;
            count++;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node setting = get(index);
        if(setting == null){
            return false;
        }else{
            setting.setValue(value);
            return true;
        }
    }
}
