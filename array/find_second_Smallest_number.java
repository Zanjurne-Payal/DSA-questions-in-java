package array;
import java.util.Scanner;
public class find_second_Smallest_number {
    static int second_min(int[] arr){
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE-1;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] < min){
                second_min = min;
                min = arr[i];
            }
            else if(arr[i] < second_min && arr[i] != min)
            {
                second_min = arr[i];
            }
        }
        return second_min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(second_min(arr));
    }
}
