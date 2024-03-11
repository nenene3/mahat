package mahat_2021_summer_b;

public class ex1 {
    public static void main(String[] args) {
        Queue<Integer> a = ret(4);
        System.out.println("a");
    }
    public static Queue<Integer> ret(int number){
        Queue<Integer> a = new Queue<>();
        for(int i=1;i<=number;i++){
            for(int j=0;j<i;j++){
                a.insert(i);
            }
        }
        return a;
    }
    public static boolean isRet(Queue<Integer> a,int n){
        a.insert(null);
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                int top = a.head();
                if(top!=i){
                    a.insert(top);
                    break;
                }
            }
        }
        if(a.head()!=null){
            while(a.head()!=null)
                a.insert(a.remove());
            return false;
        }
        return true;
    }
}
