package Ex4.explain;

public class Son extends Father {

    @Override
    public void a() {
        System.out.println("A OVERIDER");
    }


    public void c() {
        System.out.println("CCCC");
    }

    public String test1(Father test) {
        return test.toString() + " I am father";
    }
}
