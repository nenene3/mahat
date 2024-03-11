package mahat_2021_summer_b.ex10;

public class Payment {
    private int digit;
    private String name;
    private Double fuel;

    public Payment(int digit, String name, Double fuel) {
        this.digit = digit;
        this.name = name;
        this.fuel = fuel;
    }





    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }
}
