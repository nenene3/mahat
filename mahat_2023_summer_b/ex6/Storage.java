package mahat_2023_summer_b.ex6;

public class Storage {

    private Shoe[] arr;

    public Storage(Shoe[] arr) {
        this.arr = arr;
    }

    public Shoe[] getArr() {
        return arr;
    }

    public void setArr(Shoe[] arr) {
        this.arr = arr;
    }

    public int sumOrth(){
        int counter=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==null)
                continue;
            if(arr[i] instanceof Youth && ((Youth) arr[i]).isOrth()){
                counter++;
            }
        }
        return counter;
    }

}
