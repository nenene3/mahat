package mahat_2021_summer_a;

public class Ex2 {
    public static void main(String[] args) {


        Queue<Integer> a = new Queue<>();
        a.insert(2);
        a.insert(5);
        a.insert(5);
        a.insert(7);
        a.insert(2);
        a.insert(4);
        a.insert(1);
        a.insert(3);
        a.insert(2);
        a.insert(5);
        a.insert(5);
        a.insert(1);
        System.out.println(ret(a));
    }
    public static Queue<Integer> ret(Queue<Integer> queue){
        Queue<Integer> a = new Queue<>();
        queue.insert(null);
        Queue<Integer> dup = new Queue<>();
        while(queue.head()!=null){
            int tmp = queue.head();
            a.insert(tmp);
            queue.insert(queue.remove());
        }
        a.insert(null);
        queue.remove();
        while(a.head()!=null){
            int counter=0;
            int number= a.remove();
            while(a.head()!=null){
                if(a.head()==number){
                    counter++;
                    a.remove();
                }else {
                    a.insert(a.remove());
                }

            }
            if(counter>1)
                dup.insert(number);
            a.insert(a.remove());

        }
        System.out.println(dup);
        return dup;
    }

}
