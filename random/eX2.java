package random;

public class eX2 {

    public static void main(String[] args) {
        double m = 0;
        int m1,m2;
        int[] arr={6,2,8,12,4};
        for(int i=0;i< arr.length;i++){
            m1= (int) ((m+arr[i])/2.0);
            m2= (int) Math.abs((m-arr[i])/2.0);
            m=m1+m2;
        }
        System.out.println(m);
    }
}
