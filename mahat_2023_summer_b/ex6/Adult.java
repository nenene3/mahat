package mahat_2023_summer_b.ex6;

public class Adult extends Shoe{
    private int year;

    public Adult(int size, String color, int price, String producer, int year) {
        super(size, color, price, producer);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
