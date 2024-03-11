package person;

public class Person {


    int test;
    private String name;
    private int date;

    public Person() {

    }

    public Person(String name, int date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "person";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
