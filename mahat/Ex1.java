package mahat;

public class Ex1 {
    public static void main(String[] args) {


            Queue<Integer> a = new Queue<>();
            a.insert(80);
            a.insert(90);
            a.insert(100);
            a.insert(-1);
            a.insert(75);
            a.insert(96);
            a.insert(-1);
            a.insert(100);
            a.insert(100);
            a.insert(97);
            a.insert(96);
            a.insert(-1);
            a.insert(-1);
            a.insert(88);
            a.insert(94);
            a.insert(-1);

            Queue<Integer> times = ret(a);


    }
    public static Queue<Integer> ret(Queue<Integer> a){
        Queue<Integer> times= new Queue<>();
        int counter=0;
        a.insert(null);

        while(a.head()!=null){
            if(a.head()!=-1){
                counter++;
                a.insert(a.remove());
            }else{
                times.insert(counter);
                a.remove();
                counter=0;
            }
        }
        a.remove();

        System.out.println(a);
        System.out.println(times);
        return times;
    }
}
