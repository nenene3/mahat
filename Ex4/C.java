package Ex4;

public class C extends B {
    public C(int num) {
        super(num);
    }


    public boolean equals(Object other) {
        return ((other != null) && (other instanceof C) &&
                (num == ((C) other).num));
    }

}