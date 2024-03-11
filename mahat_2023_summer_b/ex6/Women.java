package mahat_2023_summer_b.ex6;

public class Women extends Adult{
    private int heel;

    public Women(int size, String color, int price, String producer, int year, int heel) {
        super(size, color, price, producer, year);
        this.heel = heel;
    }

    public int getHeel() {
        return heel;
    }

    public void setHeel(int heel) {
        this.heel = heel;
    }
    public int calcPrice(){

        return 1;
    }
}
