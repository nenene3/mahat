package mahat_2021_summer_b.ex9;

public class ExtendedPackage extends BasicPackage {
    private double price;
    private int numOFChannels;
    private String[] namesOFChannels;

    public double getPrice() {
        return price * numOFChannels + super.getPrice();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumOFChannels() {
        return numOFChannels;
    }

    public void setNumOFChannels(int numOFChannels) {
        this.numOFChannels = numOFChannels;
    }

    public String[] getNamesOFChannels() {
        return namesOFChannels;
    }

    public void setNamesOFChannels(String[] namesOFChannels) {
        this.namesOFChannels = namesOFChannels;
    }
}
