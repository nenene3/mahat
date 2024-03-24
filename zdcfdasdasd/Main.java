package zdcfdasdasd;

public class Main {
    public static void main(String[] args) {
        A y1 = new B(10);
        B y2 = new B(10);
        A z1 = new C(10);
        C z2 = new C(10);
        System.out.println(y1.f(y2));

        Obj a = new Obj();
        Obj a2 = new ObjSon();
        Check dd = new Check();
        dd.print(a2);
    }
}
