package mahat_2022_summer_b.ex10;

import mahat_2022_summer_b.Node;

import java.util.Queue;

public class Area {
    private String color;

    private int FreeSpaces;
    private Queue<Integer> car;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFreeSpaces() {
        return FreeSpaces;
    }

    public void setFreeSpaces(int freeSpaces) {
        FreeSpaces = freeSpaces;
    }

    public Queue<Integer> getCar() {
        return car;
    }

    public void setCar(Queue<Integer> car) {
        this.car = car;
    }
}
