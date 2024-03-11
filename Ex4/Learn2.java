package Ex4;

public class Learn2 extends Learn1 {

    @Override
    public void print() {
        System.out.println("class Learn2 :)");
    }

    public void print(int x) {
        print();
        System.out.println(x);
    }



}
