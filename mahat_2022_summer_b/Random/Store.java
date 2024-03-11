package mahat_2022_summer_b.Random;

public class Store {

    private Table[] tablets;
    private int[] systems;

    public Store() {
        tablets = new Table[1000];
        systems = new int[3];
    }

    public boolean add(Table tab){

        for(int i=0;i<this.tablets.length;i++){
            if(this.tablets[i]==null){
                this.tablets[i]=tab;

                return true;
            }
            if(this.tablets[i].isSame(tab) ){
                if( this.tablets[i].getPrice()<tab.getPrice()){
                    this.tablets[i].setPrice(tab.getPrice());
                    return true;
                }
                return false;

            }

        }
        return false;
    }

}
