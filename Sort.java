public class Sort {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,6,7,8,9,4};
        int head=0;
        int tail=arr.length-1;
        while(head!=tail){
            if(arr[head]%2==0)
                head++;
            else if (arr[tail]%2==1) {
                tail--;
            }else {
                int tmp=arr[head];
                arr[head]=arr[tail];
                arr[tail]=tmp;
            }

        }
        for(int i : arr)
            System.out.print(i+" ");
    }
}
