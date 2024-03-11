package mahat;

public class Ex2 {
    public static void main(String[] args) {
        Node<Integer>  a = new Node<>(1);
        Node<Integer>  a0 = new Node<>(0,a);
        Node<Integer>  a1 = new Node<>(0,a0);
        Node<Integer>  a2 = new Node<>(0,a1);
        Node<Integer>  a3 = new Node<>(0,a2);
        Node<Integer>  a4 = new Node<>(0,a3);
        Node<Integer>  a5 = new Node<>(0,a4);
        Node<Integer>  a6 = new Node<>(-33,a5);
        Node<Integer>  a7 = new Node<>(0,a6);
        Node<Integer>  a8 = new Node<>(0,a7);
        Node<Integer>  a9 = new Node<>(1,a8);
        Node<Integer>  a10 = new Node<>(1,a9);

        balance(a10);

//        for(int i=0;i<10;i++){
//            System.out.printf("Node<Integer>  a%d = new Node<>(0,a%d);\n",i,i-1);
//        }
    }
    public  static void balance(Node<Integer> start ){
        int counter=0;
        int times=1;
        Node<Integer> current=start;
        while(current.hasNext()){
            counter+= current.getValue();
            current=current.getNext();
            times++;
        }
        counter+=current.getValue();
        while(counter!=0 || times%2==1){
            times++;
            Node<Integer> add = new Node<>(counter*-1);
            current.setNext(add);
            current=current.getNext();
            counter=0;
        }
        current=start;

        while(current!=null){
            System.out.print(current.getValue()+"\t");
            current=current.getNext();
        }
        System.out.println();
        System.out.println(times);
    }
}
