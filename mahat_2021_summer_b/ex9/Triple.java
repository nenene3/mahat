package mahat_2021_summer_b.ex9;

public class Triple extends Cable{

    private Cable package1;
    private Phone phone;
    private double priceOFInternet;

    public Cable getPackage1() {
        return package1;
    }

    public void setPackage1(Cable package1) {
        this.package1 = package1;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public double getPriceOFInternet() {
        return priceOFInternet;
    }

    public void setPriceOFInternet(double priceOFInternet) {
        this.priceOFInternet = priceOFInternet;
    }
    public double getPrice(){

        return (package1.getPrice()+phone.getPrice()+priceOFInternet)*0.90;
    }
}
