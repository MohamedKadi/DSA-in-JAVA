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


    public Node getHead(){
        System.out.println("Head: "+this.head.getValue());
        return head;
    }
    public Node getTail(){
        System.out.println("Tail: "+this.tail.getValue());
        return tail;
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

    public boolean insert(int index, int value){
        System.out.println(length);
        if(index > length || index < 0){

            return false;
        }else if(index == 0){
            System.out.println("index == 0");
            prepend(value);
        }else if(index == length){
            System.out.println("index == length");
            append(value);

        }else{
            System.out.println("!index");
            int count = 0;
            Node newNode = new Node(value);
            Node temp = head;
            Node pre = head;
            while(count < index){
                count++;
                pre = temp;
                temp = temp.next;
            }
            newNode.next = temp;
            pre.next = newNode;
            length++;
        }

        return true;
    }

    public Node remove(int index){
        if(index > length || index < 0){

            return head;
        }else if(index == 0){
            return removeFirst();
        }else if(index == length){
            return removeLast();
        }else{
            int count = 0;
            Node temp = head;
            Node pre = head;
            Node after = head.next;
            while(count < index){
                count++;
                pre = temp;
                temp = temp.next;
                after = temp.next;
            }
            pre.next = after;
            return temp;
        }
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        while(temp != null){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
    }

    public Node findMiddleNode(){
        double middle = Math.ceil(length/2);
        Node temp = head;
        int count = 0;
        while(temp.next != null && count < middle){
            temp = temp.next;
            count++;
        }
        return temp;
    }

    public boolean hasLoop(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
