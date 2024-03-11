package mahat_2022_summer_b.ex10;

import mahat_2022_summer_b.Node;

public class Floor {

    private int floor;
    private Node<Area> areaNode;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Node<Area> getAreaNode() {
        return areaNode;
    }

    public void setAreaNode(Node<Area> areaNode) {
        this.areaNode = areaNode;
    }
    public String add(int carNumber){
        Node<Area> current = this.areaNode;
        while(current!=null){
            if(current.getValue().getFreeSpaces()!=0){
                current.getValue().setFreeSpaces(current.getValue().getFreeSpaces()-1);
                current.getValue().getCar().add(carNumber);
                System.out.println("added");
                return current.getValue().getColor();
            }
            current=current.getNext();
        }

        return "no room";
    }
}
