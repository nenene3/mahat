package mahat_2021_summer_b.ex10;

import mahat_2022_summer_a.Node;

public class TrickTruck {
    private Node<String> drivers;
    private Node<Integer> cars;
    private Node<Payment>[] payments;

    public boolean existDriver(String name) {
        Node<String> current = drivers;
        while (current != null) {
            if (current.getValue().equals(name)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public boolean existCar(int number) {
        Node<Integer> current = cars;
        while (current != null) {
            if (current.getValue() == number)
                return true;
            current = current.getNext();
        }
        return false;
    }

    public boolean worked(String name, int day) {

        if (existDriver(name) && (day >= 1 && day <= 30)) {
            Node<Payment> current = payments[day - 1];
            while (current != null) {
                if (current.getValue().getName().equals(name))
                    return true;
                current = current.getNext();
            }
        }

        return false;
    }
    public boolean addPayment(int number,String name,int day, double fuel){
        if((existCar(number) && existDriver(name))&& day >= 1 && day <= 30 ){
            Node<Payment> tmp = new Node<>(new Payment(number,name,fuel), payments[day-1].getNext());
            payments[day-1].setNext(tmp);

        }


        return false;
    }
    public int fuelTotal(int digit){
        int sum=0;
        for(int i=0;i<30;i++){
            Node<Payment> current  = payments[i];
            while(current!=null){
                if(current.getValue().getDigit()==digit)
                    sum+=current.getValue().getFuel();
                current=current.getNext();
            }
        }

        return sum;
    }
    public void print(){
        Node<String> currentName= drivers;
        while(currentName!=null){
            int sum=0;
            for(int i=0;i<30;i++){

                Node<Payment> currentDay= payments[i];
                while(currentDay!=null){
                    if(currentName.getValue().equals(currentDay.getValue().getName())){
                        sum++;
                        break;
                    }
                    currentDay=currentDay.getNext();
                }
            }
            System.out.println(currentName.getValue()+"    "+sum);
            currentName=currentName.getNext();
        }
    }

}
