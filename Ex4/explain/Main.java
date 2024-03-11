package Ex4.explain;

public class Main {

    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();

        father.a();
        son.a();


        Father testFather = new Son();
        testFather.a();
        testFather.b();
        //((Son)test).c();

        System.out.println(testFather.test1(father));

//        System.out.println(test.test1("SSSSS"));



    }
}
