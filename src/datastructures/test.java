package datastructures;

class A {
    public int x;
    public A() { x = 5; }
}

class B extends A {
    public B(int i) {
        this();
        x = x + i;
    }

    public B() {
        x++;
    }

    public B(String s) {
        super();
        x--;
    }
}

