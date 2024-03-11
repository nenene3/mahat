package Ex4;

public class LearnMain {

    public static void main(String[] args) {
        Learn1 learn1 = new Learn1();
        learn1.print();

        Learn2 learn2 = new Learn2();
        learn2.print();

        //Learn1(Father) <-- Learn2(Son)


        learn1 = new Learn2();
        System.out.println("++++++++++++++++++++");
        learn1.print();

        System.out.println(learn2);





//        C c = new C();
//        c.equals("hello world");
//
//




    }
}
