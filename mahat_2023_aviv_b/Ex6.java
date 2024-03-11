package mahat_2023_aviv_b;

import mahat.Node;

public class Ex6 {
    public static void main(String[] args) {

        int[] arr ={123,100,40,20,100,100,20,30,20,20,123};
        Node<Integer> a = arrToList(arr);
        buildFreqList(a);
        while(a!=null){
            System.out.println(a.getValue());
            a=a.getNext();
        }

    }
    public static void buildFreqList(Node<Integer> chain){
        Node<Integer> prev;
        while(chain!=null){
            int num = chain.getValue();
            Node<Integer> current =chain.getNext();
            int counter =1;
            prev=chain;
            while(current!=null){
                if(current.getValue()==num){
                    counter++;
                    prev.setNext(current.getNext());
                }else{
                    prev=current;
                }
                current=current.getNext();
            }
            Node<Integer> add = new Node<>(counter,chain.getNext());
            chain.setNext(add);

            chain=chain.getNext().getNext();
        }

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
}
