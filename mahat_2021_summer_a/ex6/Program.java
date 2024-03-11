package mahat_2021_summer_a.ex6;



public class Program {
    public static void main (String[] args) {
        System.out.println ("************");
        Apple a1 = new Apple (10);
        Object a2 = new Apple (10);
        Banana b1 = new Banana (10);
        Object b2 = new Banana (10);
        //************
        // 1 System.out.println (a1.weight); wont work
        // 2 System.out.println (((Banana)a2).getWeight()); הם לא יורשים אחד מהשני
        // 3 System.out.println (a1.equals(a2)); return false because overload a1 go to the equals of the object and not to the apple equals
        // 4 System.out.println (a2.equals(a1)); same reason as 3
        // 5 System.out.println (b1.equals(b2)); true because override right and b2 instanceof banana
        // 6 System.out.println (b2.equals(b1)); true overload right adn use banana
        // 7 System.out.println (a1.equals((Banana)b2)); false use object equals and not the same object
        // 8 System.out.println (a1.equals((Apple)a2)); true override the object equals
        // 9 System.out.println (b1.equals((Apple)a2)); false
        // 10 System.out.println (b1.equals((Banana)a2)); //error




    }
}