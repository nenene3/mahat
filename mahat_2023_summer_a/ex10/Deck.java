package mahat_2023_summer_a.ex10;



public class Deck {
    private  Card[] arr;

    public Deck() {

        arr = new Card[36];

    }

    public void addCard(Card c) {

        for (int i = 0; i < 36; i++) {
            if (this.arr[i] == null) {
                this.arr[i] = c;
                break;
            }
        }

    }
    public Card drawCard(){
        for(int i=0;i<36;i++){
            if(arr[i]!=null){
                Card a = arr[i];
                arr[i]=null;
                return a;
            }
        }

        return null;
    }
    public  boolean exist(Card c){
        for(int i=0;i<36;i++){
            if(arr[i]!=null && arr[i].compareTo(c)==0)
                return true;
        }
        return false;
    }
    public boolean isFull(char color){
        int counter=0;
        for(int i=1;i<=9;i++){
            Card tmp = new Card(color,i);
            if(exist(tmp)){
                counter++;
            }
        }
        return counter==9;
    }


}
