package mahat_2022_summer_a.ex10;

import mahat_2022_summer_a.Node;

public class AdvertHour {
     private Advert[] adverts;
    private int freeTime;
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public AdvertHour() {
        this.adverts = new Advert[15];
        this.freeTime = 5*60;
        this.counter = 0;
    }

    public int getFreeTime(){


        return freeTime;
    }
    public boolean isPossible2(Advert advert){
        return counter<15 && this.freeTime+advert.getLength()<=60*5;
    }
    public void add(Advert advert){
        if(isPossible2(advert))
            this.adverts[this.counter++]=advert;
    }

    public int freeTime() {
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            if (adverts[i] == null) {
                break;
            } else
                sum += adverts[i].getLength();
        }
        if (sum > 60 * 5)
            return 0;

        return Math.abs(sum - 60 * 5);
    }

    public boolean isPossible() {
        if (this.freeTime() == 0)
            return false;

        for (int i = 0; i < 15; i++)
            if (adverts[i] == null)
                return true;

        return false;
    }

    public void addAdvert(Advert a) {

        if (isPossible() && freeTime() >= a.getLength())
            for (int i = 0; i < 15; i++)
                if (adverts[i] == null) {
                    adverts[i] = a;
                    break;
                }
    }

    public Advert[] getAdverts() {
        return adverts;
    }

    public void setAdverts(Advert[] adverts) {
        this.adverts = adverts;
    }

    public void setFreeTime(int freeTime) {
        this.freeTime = freeTime;
    }
}
