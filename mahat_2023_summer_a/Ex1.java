package mahat_2023_summer_a;

public class Ex1 {
    public static void main(String[] args) {

        Queue<Integer> q = new Queue<>();
        q.insert(2);
        q.insert(10);
        q.insert(12);
        q.insert(3);
        q.insert(7);
        q.insert(4);
        q.insert(1);
        System.out.println(putInPlace(9,q));
        System.out.println("------------");
        q.insert(null);
        while(q.head()!=null){
            System.out.println(q.head());
            q.insert(q.remove());
        }
        


    }
    public static int putInPlace(int num,Queue<Integer> q ){
        int pos=1;
        q.insert(null);
        Queue<Integer> a = new Queue<>();

        while(q.head()!=null){
            if(q.head()<num){
                q.insert(q.remove());
                pos++;
            }else {
                a.insert(q.remove());
            }

        }
        q.remove();

        q.insert(num);

        while(!a.IsEmpty())
            q.insert(a.remove());


        return pos;
    }
}
