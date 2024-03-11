package mahat_2022_summer_b;

public class Ex1 {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(7);
        a.push(22);
        a.push(10);
        a.push(12);
        a.push(21);
        a.push(25);
        a.push(4);
        a.push(13);
        a.push(15);
        a.push(3);
        a.push(18);
        System.out.println(check(a));
    }
    public static boolean check(Stack<Integer> a ){
        int counter=0;
        Stack<Integer> tmp = new Stack<>();
        Stack<Integer> tmp2= new Stack<>();
        Stack<Integer> tmp3= new Stack<>();
        Stack<Integer> tmp4= new Stack<>();

        while (!a.isEmpty()){
            counter++;
            tmp.push(a.pop());
        }
        for(int i=0;i<counter/2;i++){
            tmp2.push(tmp.pop());
        }
        int eq=tmp.pop();
        boolean ret=true;


        return ret;
    }
}
