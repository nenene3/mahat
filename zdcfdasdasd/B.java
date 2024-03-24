package zdcfdasdasd;

public class B extends A {
    public B(int n)
    {
        super(n);
    }
    public boolean f(B b)
    {
        System.out.println("F in B");
        return num == b.num;
    }
}// end of class B

