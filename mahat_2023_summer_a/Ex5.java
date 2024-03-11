package mahat_2023_summer_a;

import mahat_2022_summer_a.Node;

public class Ex5 {
    public static void main(String[] args) {

        int[] arr = {100,40,20,100,100,20,30,20,20};

        Node<Integer> n = new Node<Integer>(arr[0]);
        Node<Integer> head = n;

        for (int i = 1; i < arr.length; i++){
            Node<Integer> nextNode = new Node<>(arr[i]);
            n.setNext(nextNode);
            n = nextNode;
        }
        chance(head);
        System.out.println("a");

    }
    public static void chance(Node<Integer> chain){
        Node<Integer> newNode=new Node<>(chain.getValue());
        Node<Integer> newCurrent=newNode;
        newNode.setNext(new Node<>(count(chain,chain.getValue())));
        newNode=newNode.getNext();
        Node<Integer> current = chain;
        while(current!=null){
            if(check(current)){
                newCurrent.setNext(new Node<>(current.getValue()));
                newCurrent=newCurrent.getNext();
                newCurrent.setNext(new Node<>(count(chain,current.getValue())));
            }
            current=current.getNext();
        }
        chain=newNode;

    }
    public static int count(Node<Integer> chain,int number){
        if(chain==null)
            return 0;
        int counter=0;

        while (chain!=null){
            if(chain.getValue()==number)
                counter++;
            chain=chain.getNext();
        }

        return counter;
    }
    public static boolean check(Node<Integer> chain){
        if(chain==null)
            return false;
        int find= chain.getValue();
        chain=chain.getNext();
        while(chain!=null){
            if(chain.getValue()==find)
                return false;
            chain=chain.getNext();
        }
        return true;
    }

}
