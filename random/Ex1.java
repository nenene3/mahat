package random;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a=s.next();

        int x = 0;
        while(a.charAt(0)!='z' && a.charAt(a.length()-1)!='z' ){
            if(a.charAt(0)=='x' && a.charAt(a.length()-1)=='x')
                x++;
            a=s.next();
        }
        System.out.println(x);
    }

}
