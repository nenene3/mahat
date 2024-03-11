package mahat_2022_summer_b;

public class Ex11 {
    public static void main(String[] args) {
        BinNode<Character> a = new BinNode<>('b');

        a.setLeft(new BinNode<>('w'));
        a.setRight(new BinNode<>('w'));

        a.getLeft().setRight(new BinNode<>('b'));
        a.getLeft().setLeft(new BinNode<>('b'));

        a.getRight().setRight(new BinNode<>('b'));
        a.getRight().setLeft(new BinNode<>('b'));
        System.out.println(ret(a));

    }

    public static boolean ret(BinNode<Character> a) {
        if (a == null)
            return true;
        if (a.getValue() == 'b') {
            if ((a.hasLeft() && !a.hasRight()) || (!a.hasLeft() && a.hasRight()))
                return false;
            if (a.hasLeft() && a.hasRight()) {
                if (!(a.getRight().getValue() == 'w') || !(a.getLeft().getValue() == 'w'))
                    return false;
            }
        } else if (a.getValue() == 'w') {
            if (!a.hasLeft() && !a.hasRight())
                return false;
        }
        else
            return false;

        return ret(a.getRight()) && ret(a.getLeft());
    }
}
