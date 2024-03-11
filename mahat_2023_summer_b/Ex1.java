package mahat_2023_summer_b;

public class Ex1 {
    public static void main(String[] args) {
        double x = 111111111111.0;
        double y = 111111111111.1;

        System.out.println(a(4,16));





    }
    public static boolean strangers(double num1 ,double num2){
        double end = Math.min(num1, num2);
        for(double i=2;i<end;i++){
            if(num1%i==0 && num2%i==0)
                return false;

        }
        return true;
    }
    public static boolean a(int num1 ,int num2){

        int end = Math.min(num1,num2);
        int max=Math.max(num1,num2);

        int GCD = end;
        while (end != 0)
        {
            GCD = end;
            end = max % end;
            max = GCD;
        }


        return GCD==1;
    }
    public static void chance(Queue<Integer> queue,int num){
        Queue<Integer> strangers= new Queue<>();
        Queue<Integer> notStrangers= new Queue<>();
        while(!queue.IsEmpty()){
            if(a(num, queue.head())){
                strangers.insert(queue.remove());
            }else {
                notStrangers.insert(queue.remove());
            }
        }
        while(!strangers.IsEmpty()){
            queue.insert(strangers.remove());
        }


        while(!notStrangers.IsEmpty()){
            queue.insert(notStrangers.remove());
        }
    }


}
