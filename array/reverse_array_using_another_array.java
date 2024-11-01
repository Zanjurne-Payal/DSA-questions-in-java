package array;
import java.util.Scanner;
public class reverse_array_using_another_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int j = 0 ;
        System.out.println("Reverse array :");
        for(int i = n-1 ; i >=0 ; i-- , j++)
        {
           // ans[j++] = arr[i];
            ans[j] = arr[i];
           // j++;
        }
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
