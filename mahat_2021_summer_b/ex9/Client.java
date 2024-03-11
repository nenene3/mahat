package mahat_2021_summer_b.ex9;

public class Client
{
    private String nameClient;
    private Cable cable;

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public Cable getCable() {
        return cable;
    }

    public void setCable(Cable cable) {
        this.cable = cable;
    }
    public double getPrice(){

        return cable.getPrice();

    }
}
