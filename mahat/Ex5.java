package mahat;

public class Ex5 {
    public static void main(String[] args) {
        Node<Integer> a4 = new Node<>(600);
        Node<Integer> a5 = new Node<>(300, a4);
        Node<Integer> a6 = new Node<>(27, a5);
        Node<Integer> a7 = new Node<>(13, a6);
        Node<Integer> a8 = new Node<>(6, a7);
        Node<Integer> a9 = new Node<>(3, a8);
        Node<Integer> a10 = new Node<>(1, a9);

        System.out.println(isAdd(a10,26));


    }

    public static boolean isSuper(Node<Integer> start) {
        Node<Integer> current = start;
        int next = current.getValue();
        current = current.getNext();
        while (current != null) {
            if (next >= current.getValue()) {

                System.out.println(next + " >= " + current.getValue());
                return false;
            }
            next += current.getValue();
            current = current.getNext();
        }


        return true;
    }

    public static boolean isAdd(Node<Integer> start,int num) {
        Node<Integer> current = start;
        int sum = current.getValue();
        Node<Integer> previous = current;
        current = current.getNext();

        while (current != null) {

            if (!current.hasNext() || sum>=num)
                return false;

            if(num < current.getValue() ){
               previous.setNext(new Node<Integer>(num,current));
                current=start;
                while(current!=null){
                    System.out.print(current.getValue()+"\t");
                    current=current.getNext();
                }
               return true;
            }


            sum += current.getValue();
            previous=current;
            current = current.getNext();

        }

        return false;
    }
}
