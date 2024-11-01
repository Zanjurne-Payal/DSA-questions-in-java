package array;
import java.util.Scanner;
public class Array_of_sum_of_previous_array_elements {
    static int[] sum_of_pevious_elements(int[] arr)
    {
        //my logic
//        int i = 0 ;
//        for(int j = 0 ; j < arr.length ; j++)
//        {
//            i = i + arr[j];
//            arr[j] = i;
//        }
        //mam logic
        for(int i = 1 ; i < arr.length ; i++)
        {
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
    // 1 2 3 4
    //ans = 1 3 6 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] ans = sum_of_pevious_elements(arr);
        System.out.println("Array after adding previous elements : ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(ans[i]+"    ");
        }
    }
}
