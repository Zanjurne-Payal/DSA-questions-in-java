package array;
import java.util.Scanner;
public class rotate_array_by_given_number {
    static int[] rotate(int[] arr , int r) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0 ;
        for (int i = n - r ; i < n ; i++) {
            ans[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n - r; i++)
        {
            ans[j++] =arr[i];
        }
    return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("enter element :  ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations");
        int r = sc.nextInt();
        r = r % n;
        int[] ans = rotate(arr,r);
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(ans[i]);
        }
    }
}
