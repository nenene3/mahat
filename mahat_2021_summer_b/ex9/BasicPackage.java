package mahat_2021_summer_b.ex9;

public class BasicPackage extends Cable{
    private double price;

    @Override
    public double getPrice() {

        return price+super.getPrice();

    }

    public void setPrice(double price) {
        this.price = price;
    }

}
