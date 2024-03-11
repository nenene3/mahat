package mahat_2022_summer_a.ex10;

public class ManageDay {
    AdvertHour[] advertHours;

    public double manageDay(){
        double profit=0;

        for(int i=0;i<24;i++){
            for(int j=0;j<advertHours[i].getCounter();j++){
                profit+=advertHours[i].getAdverts()[j].getPrice();
            }
        }
        return profit;
    }
}
