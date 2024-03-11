package person;

public class Student extends Person {
    private int avg;

    public Student(String name, int date) {
        super(name, date);
    }

    public void printSchedule() {
        System.out.println("sadfasdfasdfasd");
        test = 200;
    }

//    public Student(int avg) {
//        this.avg = avg;
//    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return super.toString()+" \n  Student{" +
                "avg=" + avg +
                '}';
    }
}
