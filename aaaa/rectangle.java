package aaaa;

public class rectangle {
    private point p1;
    private point p2;

    public rectangle(point p1, point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public rectangle(int x1, int y1, int x2, int y2) {
        this.p1 = new point(x1, y1);
        this.p1 = new point(x2, y2);
    }

}
