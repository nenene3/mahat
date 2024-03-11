package mahat_2021_summer_b.ex9;

public class Phone extends Cable{
    private double price;
    private int numberOFalls;

    public double getPrice() {
        return price*numberOFalls+super.getPrice();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOFalls() {
        return numberOFalls;
    }

    public void setNumberOFalls(int numberOFalls) {
        this.numberOFalls = numberOFalls;
    }
}
