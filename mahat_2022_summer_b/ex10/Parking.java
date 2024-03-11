package mahat_2022_summer_b.ex10;

import mahat_2022_summer_b.Node;

import java.util.Queue;


public class Parking {
    private Floor[] floors;

    public void addAll(Queue<Integer> carsId){
        int i=0;
        Floor current = floors[i];
        while (carsId.isEmpty()){
            if(!current.add(carsId.peek()).equals("no room ")){

                carsId.remove();
            }else {
                if(i< floors.length){
                    current=floors[i++];
                }else{
                    System.out.println("not all");
                    return;
                }
            }

        }

        if(carsId.isEmpty())
            System.out.println("empty");
        return;
    }

}
