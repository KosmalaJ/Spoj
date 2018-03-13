import java.util.Scanner;

public class Main {
    static long maxSubArraySum(int a[])
    {
        long max_so_far = a[0];
        long curr_max = a[0];
int size=a.length;
        for (int i = 1; i < size; i++)
        {
            curr_max = Math.max(a[i], curr_max+a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        if(max_so_far<0)
            return 0;
        else
        return max_so_far;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println(maxSubArraySum(array));
    }
}
