package mahat_2023_aviv_b;


import mahat.Node;

public class Ex5 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 13, 27, 300, 600};
        Node<Integer> a = arrToList(arr);
        System.out.println(isSuper(a));
        System.out.println(addToSuper(a, 1200));


    }

    public static boolean isSuper(Node<Integer> head) {
        // empty list
        // single element list
        if (!(head != null && head.hasNext()))
            return false;
        int sum = head.getValue();
        head = head.getNext();
        while (head != null) {
            if (head.getValue() <= sum) // equals
                return false;
            sum += head.getValue();
            head = head.getNext();
        }
        return true;
    }

    public static Node<Integer> arrToList(int[] arrayL) {
        Node<Integer> head = null;
        Node<Integer> temp = null;
        for (int i = 0; i < arrayL.length; i++) {
            if (i == 0) {
                head = new Node<Integer>(arrayL[i]);
                temp = head;
            } else {
                while (temp.hasNext()) {
                    temp = temp.getNext();
                }
                temp.setNext(new Node<Integer>(arrayL[i]));
            }
        }

        return head;

    }

    public static boolean addToSuper(Node<Integer> head, int num) {
        Node<Integer> prev = null;
        Node<Integer> current = head;
        boolean isToCont = true;
        while (current != null && isToCont) {
            System.out.println(current.getValue());
            if (current.getValue() > num) {
                // insert or break;
                isToCont = false;

            } else {

                prev = current;
                current = current.getNext();
            }
        }

        System.out.println("+++++++" + prev.getValue());
        Node<Integer> add = new Node<>(num, current);

        prev.setNext(add);

        if(isSuper(head)){
            return true;
        }

        prev.setNext(current);
        return false;
    }
}
