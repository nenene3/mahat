package mahat_2021_summer_a.ex1;

public class Store {


    private Tablet[] tablets;
    private int[] system;

    public Store() {
        this.system = new int[3];
        this.tablets = new Tablet[1000];
    }

    public boolean addTablet(Tablet tad) {
        int position = -1;
        int i = 0;
        for (; i < tablets.length; i++) {
            if (this.tablets[i] == null)
                break;
            if (tad.isSame(this.tablets[i])) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            this.tablets[position].setPrice(Math.max(this.tablets[position].getPrice(), tad.getPrice()));
            return true;
        }
        if (i != tablets.length) {
            this.tablets[i] = tad;
            return true;
        }


        return false;
    }

    public int sortStore() {
        int availableSeats = 1000;
        for (int i = 0; i < this.system.length; i++) {
            availableSeats -= this.system[i];
        }

        // 1 ,5,3,4,8,
        // 1 , 1, 3, 3,3,1,2,2,2
        // 1 Windows
        // 2 android
        // 3 apple


        for (int i = 0; i < this.tablets.length && this.tablets[i] != null; i++) {
            for (int j = 0; j < this.tablets.length-1 && this.tablets[i] != null; j++) {
                if (getOsValue(this.tablets[j].getSystem()) >
                        getOsValue(this.tablets[j + 1].getSystem())) {
                    Tablet tmp = this.tablets[j];
                    this.tablets[j]=this.tablets[j+1];
                    this.tablets[j+1]=tmp;
                }
            }
        }
        int index=0;
        while(this.tablets[index]!=null){
            System.out.println(this.tablets[index].getSystem());
        }
        return availableSeats;
    }


    private int getOsValue(char osChar) {
        if (osChar == 'W') {
            return 1;
        } else if (osChar == 'A') {
            return 2;
        } else {
            return 3;
        }

    }
}

