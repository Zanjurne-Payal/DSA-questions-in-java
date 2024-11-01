package array;
import java.util.Arrays;
import java.util.Scanner;
public class create_array_funcion_returns_arrayOf_sammest_Largest_noArray {
    static int[] brr(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0] , arr.length};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("enter element ");
            arr[i] = sc.nextInt();
        }
        int[] ans = brr(arr);
        System.out.println("smallest : "+ ans[0]);
        System.out.println("Largest : "+ ans[1]);
    }
}
