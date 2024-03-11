package mahat_2023_summer_a;

import mahat_2022_summer_a.Node;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {1, 11, 4, 6, 3};
        BinNode<Integer> head=create(arr);
        order(head);
        System.out.println("-----");
    }

    public static void order(BinNode<Integer> chain) {

        BinNode<Integer> tail=null;
        BinNode<Integer> current=chain;

        while(current!=null){
            tail=current;
            current=current.getRight();
        }
        current=chain;
        while(!current.equals(tail)){
            if(current.getValue()%2==0){
                current=current.getRight();
            } else if (tail.getValue()%2==1) {
                tail=tail.getLeft();
            }else{

                int tmp= tail.getValue();
                tail.setValue(current.getValue());
                current.setValue(tmp);
//                if(tail.getLeft()!=null)
//                    tail.getLeft().setRight(current);
//                if(tail.getLeft()!=null)
//                    tail.getRight().setLeft(current);
//                if(current.getRight()!=null)
//                    current.getRight().setLeft(tail);
//                if(current.getLeft()!=null)
//                    current.getLeft().setRight(tail);
//
//                BinNode<Integer> tmp = tail.getRight();
//                tail.setRight(current.getRight());
//                current.setRight(tmp);
//                tmp=tail.getLeft();
//                tail.setLeft(current.getLeft());
//                current.setLeft(tmp);

            }

        }



    }

    public static BinNode<Integer> create(int[] arr) {


        BinNode<Integer> Bn = new BinNode<Integer>(arr[0]);
        BinNode<Integer> Bhead = Bn;


        for (int i = 1; i < arr.length; i++) {
            BinNode<Integer> nextNode = new BinNode<>(arr[i]);
            nextNode.setLeft(Bn);
            Bn.setRight(nextNode);
            Bn = nextNode;
        }

        return Bhead;
    }
}
