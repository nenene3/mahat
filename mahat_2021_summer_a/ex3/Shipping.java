package mahat_2021_summer_a.ex3;

public class Shipping {


    private String address;

    private Object[] arr;

    public double sun() {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (this.arr[i] instanceof Book)
                sum += ((Book) this.arr[i]).getPrice();
            else {

                sum += ((Clothes) this.arr[i]).getPrice();
            }
        }
        return sum;
    }

}
