package person;

public class MainIherPerson {

    public static void main(String[] args) {
        Person person = new Person("aaa",200);
        person.setDate(100);
        person.setName("David Cohen");
        System.out.println(person);

        person.test = 200;

        Student student = new Student("mosh levi",300);
        student.setAvg(100);
        student.setName("Moshe Levi");
        student.setDate(200);
        student.printSchedule();
        System.out.println(student);
    }
}
