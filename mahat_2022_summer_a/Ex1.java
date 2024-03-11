package mahat_2022_summer_a;

public class Ex1 {
    public static void main(String[] args) {
        Node<Integer> end = new Node<>(94);
        Node<Integer> a1 = new Node<>(88,end);
        Node<Integer> a2 = new Node<>(96,a1);
        Node<Integer> a3 = new Node<>(97,a2);
        Node<Integer> a4 = new Node<>(100,a3);
        Node<Integer> a5 = new Node<>(100,a4);
        Node<Integer> forget = new Node<>(96,a5);
        Node<Integer> a6 = new Node<>(75,forget);
        Node<Integer> a7 = new Node<>(100,a6);
        Node<Integer> a8 = new Node<>(90,a7);
        Node<Integer> a9 = new Node<>(80,a8);



        Node<Integer> student = new Node<>(2);
        Node<Integer> student2 = new Node<>(4,student);
        Node<Integer> student3 = new Node<>(2,student2);
        Node<Integer> student4 = new Node<>(3,student3);
        Queue<Integer> a = new Queue<>();

        Node<Integer> current =a9;
        while(current!=null){
            a.insert(current.getValue());
            current=current.getNext();
        }
        System.out.println(a);


        Queue<Integer> students=new Queue<>();
        current =student4;
        while(current!=null){
            students.insert(current.getValue());
            current=current.getNext();
        }
        System.out.println(students);

        System.out.println(avg(students,a));


    }


    public static Queue<Float> avg(Queue<Integer> students,Queue<Integer> scores){
        Queue<Float> ret = new Queue<>();
        students.insert(null);
        while (students.head()!=null){
            int times=students.remove();
            students.insert(times);
            Float sum= 0.0F;
            for(int i=0;i<times;i++){
                sum+= scores.head();
                scores.insert(scores.remove());
            }
            ret.insert(sum/times);
        }
        return ret;
    }
}
