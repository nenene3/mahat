package mahat_2022_summer_b;

public class Ex2 {
    public static void main(String[] args) {

        Node<Integer> a5 = new Node<>(0);
        Node<Integer> a4 = new Node<>(1,a5);
        Node<Integer> a3 = new Node<>(-2,a4);
        Node<Integer> a2 = new Node<>(1,a3);
        Node<Integer> a1 = new Node<>(2,a2);
        Node<Integer> a0 = new Node<>(3,a1);
        System.out.println(chain(a0));

    }
    public static int count(Node<Integer> a){
        int counter=0;
        Node<Integer> current = a.getNext();
        while(current!=null){
            counter++;
            current=current.getNext();
        }

        return counter;
    }
    public static boolean chain(Node<Integer> start){
        int pos=count(start);
        Node<Integer> curr = start;
        while(curr!=null){
            if(curr.getValue()>pos)
                return false;

            curr=curr.getNext();
            pos--;
        }


        return true;
    }
}
