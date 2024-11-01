package array;
import java.util.Scanner;
public class sum_Of_1st_part_is_equal_to_sum_of_2nd_part_in_array {
    static int total_sum(int[] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += arr[i];
        }
        return sum;
    }
    static boolean equal_sum(int[] arr){
        int total_sum = total_sum(arr);
        int prefix = 0 , suffix = 0 ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            prefix += arr[i];
            suffix = total_sum - prefix;
            if(prefix == suffix) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = equal_sum(arr);
        System.out.println("is array dived in same sum ? : "+ans);
    }
}
