package datastructures;

public class Nodev2 {
    private int value;
    Nodev2 next;
    Nodev2 prev;

    public Nodev2(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;

    }

    public void setValue(int value){
        this.value = value;
    }
}
