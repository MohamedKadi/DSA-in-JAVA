package datastructures;

public class Node {
    private int value;
    Node next;

    public Node(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public int setValue(int value){
        return this.value = value;
    }
}
