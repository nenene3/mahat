package mahat_2021_summer_a.Ex4;

public class B extends A{
    public void f(){
        System.out.println("B.f");
    }
    public void g() {
        System.out.println("B.g");
    }
    public void superG() {
        super.g();
    }
}