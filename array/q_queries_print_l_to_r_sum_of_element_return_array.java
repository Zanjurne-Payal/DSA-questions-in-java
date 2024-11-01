package array;
import java.util.Scanner;
public class q_queries_print_l_to_r_sum_of_element_return_array {
    static int[] part_Array(int[] arr){
        for(int i = 1 ; i < arr.length ; i++)
        {
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1 ; i <= n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] ans = part_Array(arr);
        for(int i = 1 ; i <= n ; i++)
        {
            System.out.print(ans[i]+" ");
        }
        System.out.println("\nEnter the number queries :");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("\nEnter the starting point :");
            int s = sc.nextInt();
            System.out.println("\nEnter the ending point :");
            int e = sc.nextInt();
            if(s >= 0 && s < ans.length && e >= 0 && e < ans.length)
            {
                for(int i = s ; i <= e ; i++)
                {
                    System.out.print(ans[i]+" ");
                }
            }
            else
            {
                System.out.println("Please enter valid input");
            }
        }
    }
}
