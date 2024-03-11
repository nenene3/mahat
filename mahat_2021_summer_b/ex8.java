package mahat_2021_summer_b;

public class ex8 {
    public static void main(String[] args) {

    }
    public static int secret(Queue<Integer> q) {
        Queue<Integer> temp=new Queue<Integer>();
        while(!q.IsEmpty()){
            temp.insert(q.remove());
        }
        int c=0;
        while(!temp.IsEmpty()){
            c++;
            q.insert(temp.remove());
        }
        return c;
    }
    public static int what(Queue<Integer>q) {
        int len = secret(q);
        int temp = q.remove();
        q.insert(temp);
        for(int i = 0; i < len; i++){
            int curr = q.remove();
            q.insert(curr);
            if(curr > temp)
                temp = curr;
        }
        return temp;
    }
    public static boolean something(Queue<Integer> q1 , Queue<Integer> q2)
    {
        if(secret(q1)==0)
            return false;
        int temp = what(q1);
        int len = secret(q2);
        for(int i = 0; i < len; i++){
            int curr = q2.remove();
            q2.insert(curr);
            if(temp <= curr)
                return false;
        }
        return true;
    }
}
