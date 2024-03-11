import java.util.HashSet;
import java.util.Set;

public class stam {
    public static void main(String[] args) {



        int[] arr = {100, 200, 300, 400, 400, 400, 400, 100, 500};
        Set<Integer> mySet = new HashSet<>();


        for (int v : arr) {
            mySet.add(v);
        }

        Object[] arr1 = mySet.toArray();
        Integer[] arr2 = mySet.toArray(new Integer[0]);

        System.out.println(arr2.toString());

    }
}
