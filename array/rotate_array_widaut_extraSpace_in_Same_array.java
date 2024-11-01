package array;
import java.util.Scanner;
public class rotate_array_widaut_extraSpace_in_Same_array {
    static int[] reverse(int[] arr , int a , int b){
        int j = b;
        for(int i = a ; i < j ; i++)
        {
                arr[i] = arr[i]+arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
                j--;
        }
        return arr;
    }
    static int[] rotate(int[] arr , int r)
    {
        reverse(arr ,0, arr.length-r-1);
        reverse(arr , arr.length- r , arr.length-1);
        reverse(arr , 0 , arr.length-1);
        return arr;
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
        int[] ans = rotate(arr , r);
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(ans[i]);
        }
    }
}
