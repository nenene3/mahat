package mahat_2022_aviv_a.ex7;

import mahat_2022_aviv_a.Stack;

public class TStack {
    Stack<Integer> stacks[];

    public TStack(Stack<Integer>[] a) {
        this.stacks = a;
    }
    public void move(int from,int to){
        switch (from)
        {
            case 0:
                if(to!=1)
                    return;
                break;
            case 1:
                if(to!=2)
                    return;
                break;
            case 2:
                if(to!=0)
                    return;
                break;
            default:
                return;
        }
       this.stacks[to].push(this.stacks[from].pop());
    }
    public boolean bigOrEqual(int from,int toCompare){

        return this.stacks[from].top()>=this.stacks[toCompare].top();

    }
    public boolean isEmpty(int stuckId){

        return this.stacks[stuckId].isEmpty();

    }
    public void max(){
        move(0,1);
        while(isEmpty(0)){
            if(bigOrEqual(0,1)){
                move(1,2);
                move(0,1);
            }else{
                move(0,1);
                move(1,2);
            }
        }
    }

    public void sort(){
        while(!isEmpty(1))
            move(1,2);

        while(!isEmpty(2))
            move(2,0);


        while( !isEmpty(0)) {
            max();
            while(isEmpty(2))
                move(2,0);
        }
    }
}
// 5,0,4,1,2,3