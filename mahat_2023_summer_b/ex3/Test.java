package mahat_2023_summer_b.ex3;

public class Test
{
    public static void main(String[] args)
    {
        First[] arr = new First[5];
        arr[0] = new First (13);
        arr[1] = new First ();
        arr[2] = new Second();
        arr[3] = new Second(5, arr[0]);
        arr[4] = new Second(2, 3.7, arr[2]);

        arr[2].num=8;
    }
}
