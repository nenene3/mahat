package mahat_2023_summer_b.ex3;

public class Second extends First
{
    public double x;
    private First f;
    //.............


    public Second(int num,double x , First f){

        super(5);
        this.x=5.5;
        this.f=f;

    }
    public Second(int num, First f){

        super(num);
        this.f=f;
        this.x=5.5;
    }
    public Second(){
        super();
        this.x=1.1;
        this.f=null;
    }
}
