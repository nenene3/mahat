package mahat_2023_summer_b.ex6;

public class Men extends Adult{

    private boolean work;

    public Men(int size, String color, int price, String producer, int year, boolean work) {
        super(size, color, price, producer, year);
        this.work = work;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }
}
