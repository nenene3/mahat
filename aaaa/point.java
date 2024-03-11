package aaaa;

public class point {

    private int x;
    private int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public point(point other){
        this.x=other.x;
        this.y=other.y;
    }
}
