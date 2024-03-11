package Ex4;


public class D extends B {
    public D(int num) {
        super(num + 1);
    }


    public boolean equals(D other) {
        return ((other != null) && (num == other.num));
    }

    public void printIt() {
        System.out.println("print it");
    }

    public String toString() {
        return "I am D "+num;
    }

}