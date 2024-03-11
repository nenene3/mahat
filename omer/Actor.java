package omer;

public class Actor {
    private String date;
    private String name;

    public Actor(String name, String date) {
        this.date = date;
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "hi my name is "+this.name;
    }
}
