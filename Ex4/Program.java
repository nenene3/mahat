package Ex4;
public class Program
{
    public static void main(String[] args)
    {
        B b = new B(1);
        C c = new C(1);
        D d = new D(1);
        B b1 = new D(1);
        Object c1 = new C(1);
        Object d1 = new D(1);

        Object objNewD = new D(1);
        D dNewD = new D(1);
//        System.out.println(b1.equals(b));
//        System.out.println(c1.equals(c));
        d1.equals(d);
//         System.out.println(d1.equals(d));
        System.out.println(d.equals(d1));
        

    }
}
