package mahat_2022_aviv_a.ex22;

import mahat_2022_summer_b.BinNode;

public class Main {
    public static void main(String[] args) {

        BinNode<Integer> a = new BinNode<>(70);
        //right tree
        a.setRight(new BinNode<>(51));
        a.getRight().setRight(new BinNode<>(212));
        a.getRight().getRight().setRight(new BinNode<>(17));
        a.getRight().getRight().getRight().setRight(new BinNode<>(18));
        a.getRight().getRight().setLeft(new BinNode<>(22));

        //left tree
        a.setLeft(new BinNode<>(10));
        a.getLeft().setLeft(new BinNode<>(1));
        a.getLeft().setRight(new BinNode<>(1822));


        System.out.println(checkRoot(a));

        for (int i = 1; i < 7; i++) {
            print(a, i);
            System.out.println();
        }

    }

    public static void print(BinNode<Integer> head, int num) {
        if (head == null)
            return;
        if (num <= 1) {
            System.out.print(head + "   ");

            return;
        }

        print(head.getLeft(), num - 1);
        print(head.getRight(), num - 1);

    }

    public static boolean checkRoot(BinNode<Integer> head) {
        if (head == null)
            return true;
        if (head.hasLeft() && head.hasRight())
            //add && !checkRootHelper(head,head.getRight())
            if (!checkRootHelper(head, head.getLeft()) && !checkRootHelper(head, head.getRight())) {
                return false;
            }

        return checkRoot(head.getRight()) && checkRoot(head.getLeft());
    }

    public static boolean checkRootHelper(BinNode<Integer> head, BinNode<Integer> current) {
        if (current == null)
            return true;

        return check(head.getRight(), current.getValue()) && checkRootHelper(head, current.getRight()) && checkRootHelper(head, current.getLeft());
    }

    public static boolean check(BinNode<Integer> head, int num) {
        if (head == null)
            return true;
        if (head.getValue() == num)
            return false;
        return check(head.getLeft(), num) && check(head.getRight(), num);
    }
}


//    public static boolean isSame(BinNode<Integer> current,int num){
//        if(current==null)
//            return true;
//        if(num== current.getValue())
//            return false;
//        return isSame(current.getLeft(), num) && isSame(current.getRight(), num) ;
//    }
