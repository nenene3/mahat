package mahat_2023_summer_b;

public class Ex2 {
    public static void main(String[] args) {
//
//        Node<Integer> a = new Node<>(2);
//        Node<Integer> a2 = new Node<>(2,a);
//        Node<Integer> a3 = new Node<>(3,a2);
//        Node<Integer> a4 = new Node<>(3,a3);
//        Node<Integer> a5 = new Node<>(4,a4);
//        Node<Integer> a6 = new Node<>(5,a5);

        int[] arr = {100,100,20,3,5,2,32,3,2,3,4,5,6,7};

        Node<Integer> head = new Node<Integer>(arr[0]);
        Node<Integer> tmp = head;
        for(int i = 1; i < arr.length;i++)
        {
            tmp.setNext(new Node<Integer>(arr[i]));
            tmp=tmp.getNext();
        }
        Node<Integer> ret =split(head);
        print(head);
        print(ret);


    }
    public static Node<Integer> split(Node<Integer> chain){
        if(chain==null)
            return null;


        int find = chain.getValue()%2;
        Node<Integer> newChain=null;
        Node<Integer> oldChain= null;
        Node<Integer> current =chain.getNext();

        while(current!=null){

            if(current.getValue()%2==find){
                Node<Integer> temp = new Node<Integer>(current.getValue() ,oldChain);
                oldChain = temp;
            }
            else
            {
                Node<Integer> temp = new Node<Integer>(current.getValue(), newChain);
                newChain = temp;

            }
            current=current.getNext();
        }
        chain.setNext(oldChain);
        return newChain;

    }
    public static void print(Node<Integer> head ){
        Node<Integer> tmp = head;


        while(tmp != null)
        {
            System.out.println(tmp);
            tmp=tmp.getNext();
        }

        System.out.println();
    }
}
