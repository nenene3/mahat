package mahat_2023_summer_b;

public class Ex5_2 {
    public static void main(String[] args) {
        Stack<Integer> head = new Stack<>();
        head.push(7);
        head.push(3);
        head.push(10);
        head.push(12);
        head.push(21);
        head.push(12);
        head.push(3);
        head.push(13);
        head.push(15);
        head.push(3);
        head.push(18);
        System.out.println(head);
        System.out.println(firstPlace(head, 1234));
        System.out.println(lastPlace(head, 3));
    }

    public static int firstPlace(Stack<Integer> stk, int num) {
        int position = 1;
        Stack<Integer> tmp = new Stack<>();

        while (!stk.isEmpty()) {
            if (stk.top() == num)
                break;
            tmp.push(stk.pop());
            position++;
        }

        if (stk.isEmpty())
            position = -1;
        while (!tmp.isEmpty())
            stk.push(tmp.pop());


        return position;
    }

    public static int lastPlace(Stack<Integer> stk, int num) {
        int position = 1;
        int lastPosition = -1;
        Stack<Integer> tmp = new Stack<>();

        while (!stk.isEmpty()) {
            if (stk.top() == num)
                lastPosition = position;
            tmp.push(stk.pop());
            position++;
        }

        while (!tmp.isEmpty())
            stk.push(tmp.pop());


        return lastPosition;
    }
}
