package mahat_2022_aviv_a;

public class Ex1 {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(1);
        Node<Integer> a1 = new Node<>(2,a);
        Node<Integer> a2 = new Node<>(3,a1);
        dup(a2);
        System.out.println("a");
    }
    public static void multi(Node<Integer> head){
        Node<Integer> current = head;
        while(current!=null){
            Node<Integer> last=current;
            Node<Integer> between = new Node<>(last.getValue(),current.getNext());
            last.setNext(between);
            current=current.getNext().getNext();
        }
        System.out.println("a");
    }
    public static void dup(Node<Integer> head){
        if(head==null){
            return;
        }
        int counter=1;
        Node<Integer> last = head;
        while(last.hasNext()){
            counter++;
            last=last.getNext();
        }
        Node<Integer> current = head;
        for(int i=0;i<counter;i++){
            last.setNext(new Node<>(current.getValue()));
            last=last.getNext();
            current=current.getNext();
        }
    }
}
