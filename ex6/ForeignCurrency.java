package ex6;


import mahat_2021_summer_b.Node;

public class ForeignCurrency {
    private String name;
    private Node<Double> rates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node<Double> getRates() {
        return rates;
    }

    public void setRates(Node<Double> rates) {
        this.rates = rates;
    }
    public void addRate(Node<Double> add){
        add.setNext(this.rates);
        this.rates=add;
    }
    public boolean isHigh(){
        double high=this.rates.getValue();
        Node<Double> current = this.rates.getNext();
        while(current!=null){
            if(current.getValue()>high)
                return false;
            current=current.getNext();
        }

        return true;
    }
    public boolean investGood(){
        if(isHigh())
            return false;

        Node<Double> current = this.rates.getNext();
        double a = rates.getValue();
        for(int i=0;i<4;i++){
            if(current == null || a<current.getValue())
                return false;
            current=current.getNext();
        }



        return true;
    }
}
