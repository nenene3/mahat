package mahat_2023_summer_b.ex6;

public class Shoe {
    private int size;
    private String color;
    private int price;
    private String producer;

    public Shoe(int size, String color, int price, String producer) {
        this.size = size;
        this.color = color;
        this.price = price;
        this.producer = producer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public int calcPrice(){
        int sum=this.price;
        if(this.size>=40)
            sum+=300;

        return sum;
    }

}
