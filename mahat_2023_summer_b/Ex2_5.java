package mahat_2023_summer_b;

public class Ex2_5 {
    public static void main(String[] args) {

        int[] arr = {11,3,5,7,9,12,10};

        Node<Integer> head = new Node<Integer>(arr[0]);
        Node<Integer> tmp = head;
        for(int i = 1; i < arr.length;i++)
        {
            tmp.setNext(new Node<Integer>(arr[i]));
            tmp=tmp.getNext();
        }
        Node<Integer> ret =a(head);
        while(ret!=null)
        {
            System.out.println(ret.getValue());
            ret=ret.getNext();
        }
        while(head!=null)
        {
            System.out.println(head.getValue());
            head=head.getNext();
        }


    }
    public static Node<Integer> a(Node<Integer> head){
        Node<Integer> newChain = null;
        Node<Integer> candid = head;
        int remove = (head.getValue()+1)%2;
        head=head.getNext();
        while(head!=null){

            if(head.getValue()%2==remove){
                if(newChain==null){
                    newChain=new Node<>(head.getValue());
                }else{
                    Node<Integer> cur = newChain;
                    while (cur.hasNext())
                        cur=cur.getNext();
                    cur.setNext(new Node<>(head.getValue()));
                }
                candid.setNext(head.getNext());
            }else{
                candid=head;
            }
            head=head.getNext();
        }
        return newChain;

    }
}
