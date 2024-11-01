package array;
import java.util.Scanner;
public class sum_of_array_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(arr.length);
        System.out.println("enter the elements ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("sum of array elements :"+sum);
    }
}
