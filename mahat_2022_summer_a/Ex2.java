package mahat_2022_summer_a;

public class Ex2 {
    public static void main(String[] args) {
        //10
        // 1 --> 0
        //1,000,000
        //1,000,000,000
        //9,223,372,034,854,775,808
        //https://www.w3schools.com/java/ref_keyword_long.asp


//        Node<Integer> a1 = new Node<>(7);
//        Node<Integer> a2 = new Node<>(6, a1);
//        Node<Integer> a3 = new Node<>(5, a2);
//        Node<Integer> a4 = new Node<>(4, a3);
//        Node<Integer> a5 = new Node<>(3, a4);
//        Node<Integer> a6 = new Node<>(2, a5);
//        Node<Integer> a7 = new Node<>(1, a6);
//
//
//        Node<Integer> b1 = new Node<>(7);
//        Node<Integer> b2 = new Node<>(6, a1);
//        Node<Integer> b3 = new Node<>(5, a2);
//        Node<Integer> b4 = new Node<>(4, a3);
//        Node<Integer> b5 = new Node<>(3, a4);
//        Node<Integer> b6 = new Node<>(2, a5);
//        Node<Integer> b7 = new Node<>(1, a6);

        Node<Integer> aa = new Node<>(9);
        Node<Integer> a1 = new Node<>(9, aa);
        Node<Integer> a2 = new Node<>(9, a1);


        Node<Integer> b = new Node<>(9);
        Node<Integer> b2 = new Node<>(9, b);
        Node<Integer> b3 = new Node<>(9, b2);


        Node<Integer> result = add(b3, a2);
        System.out.println(a2);
        System.out.println(b3);
        System.out.println(result);

        // 999
        // 001
        // 1000

        // carrier - 1

        // 0 (1)
        // 10


//        for(int i=1;i<=7;i++){
//            System.out.printf("Node<Integer> a%d = new Node<>(8,a%d);\n",i,i-1);
//        }


    }

    public static int numDigits(Node<Integer> n) {
        int sum = 0;
        while (n != null) {
            sum++;
            n = n.getNext();
        }


        return sum;
    }

    public static Node<Integer> add(Node<Integer> num1, Node<Integer> num2) {
        Node<Integer> rev1 = revList(num1);
        Node<Integer> rev2 = revList(num2);
        int carrier = (rev1.getValue() + rev2.getValue()) < 10 ? 0 : 1;


        Node<Integer> ret = new Node<>((rev1.getValue() + rev2.getValue()) % 10);
        rev1 = rev1.getNext();
        rev2 = rev2.getNext();

        Node<Integer> head = ret;
//        ret=ret.getNext();
        while (rev1 != null || rev2 != null) {

            if (rev1 != null && rev2 != null) {
                ret.setNext(new Node<>((rev1.getValue() + rev2.getValue() + carrier) % 10));
                carrier = (rev1.getValue() + rev2.getValue() + carrier) < 10 ? 0 : 1;
                rev1 = rev1.getNext();
                rev2 = rev2.getNext();
                ret = ret.getNext();
            } else if (rev1 != null) {
                ret.setNext(new Node<>((rev1.getValue() + carrier) % 10));
                carrier = (rev1.getValue() + carrier) < 10 ? 0 : 1;
                rev1 = rev1.getNext();
                ret = ret.getNext();
            } else {
                ret.setNext(new Node<>((rev2.getValue() + carrier) % 10));
                carrier = (rev2.getValue() + carrier) < 10 ? 0 : 1;
                rev2 = rev2.getNext();
                ret = ret.getNext();
            }

        }
        if (carrier == 1) {
            ret.setNext(new Node<>(1));
        }

        Node<Integer> a = revList(head);
        Node<Integer> wwww = a;
        while (wwww != null) {
            //System.out.print(wwww.getValue()+"\t");
            wwww = wwww.getNext();
        }
        return a;
    }


    public static int bigger(Node<Integer> num1, Node<Integer> num2) {

        int len1 = numDigits(num1);
        int len2 = numDigits(num2);
        if (len1 != len2) {
            return len1 > len2 ? 1 : 2;
        }
        while (num1 != null) {
            if (!num1.getValue().equals(num2.getValue())) {
                return num1.getValue() > num2.getValue() ? 1 : 2;
            }
            num2 = num2.getNext();
            num1 = num1.getNext();
        }

        return 0;
    }

    public static Node<Integer> newNum(Node<Integer> num1, Node<Integer> num2) {
        Node<Integer> ret = new Node<>(null);
        // 1784
        // head -->1 -->7 --> 8 -->4

        //1784 + 927 = 2711


        // head -->4 --> 8 --> 7 -->1    // reverse number 1
        // head --> 7 --> 2 --> 9        // reverse number 2

        // 1 --> 1 --> 7 --> 2


        // 1. reverse 2 numbers
        // while - end of the numbers
        // 2. calculate ADD command for 1 digit from 2 numbers
        // 3. reverse the result


        // 111
        // 1784
        //  927
        //-------
        //  711
        //-> 1 , 0, 0 , 0

        // add between the most right 2 digits --> add result as the most right digit
        // if (result > 10)
        //   add res % 10 as right digit
        //   remember 1 as carrier
        //
        // go the next digit after the right one of the 2 numbers
        // run add command to the 2 digits + carrier
        //   add res % 10 as right digit
        //   remember 1 as carrier
        //
        //


        return ret;
    }

    public static Node<Integer> revList(Node<Integer> head) {
        Stack<Integer> stack = new Stack<>();
        Node<Integer> current = head;
        while (current != null) {
            stack.push(current.getValue());
            current = current.getNext();
        }
        Node<Integer> rev = new Node<>(stack.pop());
        Node<Integer> ret = rev;
        while (!stack.isEmpty()) {
            rev.setNext(new Node<>(stack.pop()));
            rev = rev.getNext();
        }
        return ret;
    }
}
