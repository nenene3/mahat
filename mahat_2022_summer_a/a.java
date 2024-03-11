package mahat_2022_summer_a;

public class a {
    public static void main(String[] args) {
        int[] arr={5,20,9,6,5,8,2};
        Node<Integer> list = new Node<>(arr[0]);
        Node<Integer> current = list;
        for(int i=1;i< arr.length;i++){
            current.setNext( new Node<Integer>(arr[i]));
            current=current.getNext();
        }
        current=list;
        Node<Integer> sum= new Node<>(Math.abs(current.getValue()-current.getNext().getValue()));
        Node<Integer> qwe= sum;
        current=current.getNext();

        while(current.hasNext()){
            Node<Integer> a = new Node<>(Math.abs(current.getValue()-current.getNext().getValue()));
            qwe.setNext(a);
            qwe=sum.getNext();
            current=current.getNext();
        }
    }
}
