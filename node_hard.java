import mahat_2022_summer_b.BinNode;

public class node_hard {
    public static void main(String[] args) {
        BinNode<Integer> a = new BinNode<>(7);
        //right tree
        a.setRight(new BinNode<>(7));
        a.getRight().setRight(new BinNode<>(7));
        a.getRight().getRight().setRight(new BinNode<>(27));
        a.getRight().getRight().getRight().setRight(new BinNode<>(13));
        a.getRight().getRight().setLeft(new BinNode<>(7));

        //left tree
        a.setLeft(new BinNode<>(10));
        a.getLeft().setLeft(new BinNode<>(1));
        a.getLeft().setRight(new BinNode<>(312341));
        System.out.println(tree(a));
    }

    public static boolean tree(BinNode<Integer> head) {
        if (head == null)
            return true;
        if (head.hasLeft() && head.hasRight()) {
            if (!treeHelp(head.getLeft(), head.getRight()))
                return false;
        }
        return tree(head.getRight()) && tree(head.getLeft());
    }

    public static boolean treeHelp(BinNode<Integer> left, BinNode<Integer> right) {
        if (left == null)
            return true;
        return dontHave(right, left.getValue()) && treeHelp(left.getLeft(), right) && treeHelp(left.getRight(), right);
    }

    public static boolean dontHave(BinNode<Integer> head, int num) {
        if (head == null)
            return true;
        if (head.getValue() == num)
            return false;

        return dontHave(head.getLeft(), num) && dontHave(head.getRight(), num);
    }

}
