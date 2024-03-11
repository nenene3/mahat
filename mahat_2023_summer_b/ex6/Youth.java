package mahat_2023_summer_b.ex6;

public class Youth extends Shoe{
    private boolean orth;

    public Youth(String producer,int size,String color,int price,boolean orth){
        super(size, color, price, producer);
        this.orth=orth;
    }

    public boolean isOrth() {
        return orth;
    }

    public void setOrth(boolean orth) {
        this.orth = orth;
    }
}
