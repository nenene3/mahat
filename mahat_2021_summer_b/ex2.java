package mahat_2021_summer_b;

public class ex2 {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(1);
        Node<Integer> start = null;
//
//        for(int i=256/2;i>0;i/=2){
//             start=new Node<>(i,a);
//            a=start;
//        }

//        start=new Node<>(a.getValue(),a);
//        System.out.println();
        for(int i=1;i<=256;i*=2){
            start=new Node<>(i,a);
            a=start;
        }
        System.out.println(isRev(start));

    }
    public static boolean isSum(Node<Integer> a){
        if(a==null)
            return true;

        Node<Integer> current = a.getNext();
        int sum=a.getValue();
        while(current!=null){
            if(sum!= current.getValue())
                return false;
            sum+= current.getValue();
            current=current.getNext();
        }


        return true;
    }
    public static boolean isSumRev(Node<Integer> a){
        Stack<Integer> tmp = new Stack<>();

        Node<Integer> start= new Node<>(tmp.pop());
        while(!tmp.isEmpty()){
            start=start.getNext();
            start.setNext(new Node<>(tmp.pop()));
        }


        return isSum(start);
    }
    public static boolean isRev(Node<Integer> start){
        if(start==null)
            return true;
        int sum = start.getValue();
        Node<Integer> current = start.getNext();
        while(current.hasNext()){
            if(sum/2!= current.getValue())
                return false;
            current=current.getNext();
            sum/=2;
        }
        sum-= current.getValue();
        return sum==0;

    }

}
