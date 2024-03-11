package mahat_2023_summer_a;

public class Ex123 {
    public static void main(String[] args) {

        Node<Integer> a5 = new Node<>(9);
        Node<Integer> a4 = new Node<>(1, a5);
        Node<Integer> a3 = new Node<>(7, a4);
        Node<Integer> a2 = new Node<>(7, a3);
        Node<Integer> a1 = new Node<>(9, a2);
        Node<Integer> a0 = new Node<>(9, a1);
        Node<Integer> b10 = new Node<>(7, a0);
        Node<Integer> b9 = new Node<>(3, b10);
        Node<Integer> b8 = new Node<>(9, b9);
        Node<Integer> b7 = new Node<>(4, b8);
        System.out.println(ret(b7, 3));
    }

    public static int ret(Node<Integer> head, int num) {
        int start = -1;
        int end = 0;
        int counter = 0;


        while (head != null) {
            if (head.getValue() == num) {
                start = counter;
                break;
            }
            counter++;
            head = head.getNext();
        }
        if (start == -1)
            return -1;
        while (head != null) {
            counter++;
            if (head.getValue() == num)
                counter = 0;
            head=head.getNext();
        }


        return start + counter;
    }
}
