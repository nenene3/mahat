package mahat_2023_summer_b;

public class Ex5 {
    public static void main(String[] args) {

        int[] arr= {4,8,-2,11,4,13,11,1,-2,8,1};
        Stack<Integer> a =buildStack(arr);

        System.out.println(minDis(a));


    }
    public static int firstPlace(int num,Stack<Integer> stk){
        if(stk==null)
            return -1;

        Stack<Integer> tmp = new Stack<>();
        int counter=1;
        while(  !stk.isEmpty() && num!=stk.top()){
            tmp.push(stk.pop());
            counter++;
        }
        if(!stk.isEmpty()){
            while(!tmp.isEmpty())
                stk.push(tmp.pop());
            return counter;
        }

        while(!tmp.isEmpty())
            stk.push(tmp.pop());

        return -1;
    }
    public static int lastPlace(Stack<Integer> stk , int num){
        if(stk==null)
            return -1;
        int pos=-1;
        int counter=1;
        Stack<Integer> tmp = new Stack<>();
        while(!stk.isEmpty()){
            if(stk.top()==num)
                pos=counter;
            counter++;
            tmp.push(stk.pop());

        }

        while(!tmp.isEmpty())
            stk.push(tmp.pop());

        return pos;
    }
    public static Stack<Integer> buildStack(int[] arr){
        Stack<Integer> ret=new Stack<>();
        for(int i= arr.length-1;i>=0;i--){
            ret.push(arr[i]);
        }
        return ret;
    }
    public static int minDis(Stack<Integer> stk){
        int dis=-1;
        Stack<Integer> tmp = new Stack<>();
        while(!stk.isEmpty()){
            int top = stk.pop();
            if(lastPlace(stk,top)!=-1){
                if(dis==-1 || dis>lastPlace(stk,top)){
                  dis=lastPlace(stk,top);
                }
            }
            tmp.push(top);
        }
        while(!tmp.isEmpty()){
            stk.push(tmp.pop());
        }
        return dis-1;
    }
}
