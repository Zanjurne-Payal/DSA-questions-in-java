package array;
import java.util.Scanner;
public class sort_Array_by_squre_of_number {
    static int[] sort(int[] arr){
        int start = 0 ;
        int end = arr.length-1 ;
        int[] ans = new int[arr.length];
        int k = arr.length-1 ;
        while(start <= end){
            if(Math.abs(arr[start]) > Math.abs(arr[end]))
            {
                ans[k--] = arr[start] * arr[start];
                start++;
            }
            else
            {
                ans[k--] = arr[end] * arr[end];
                end--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("\narray befor sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        int[] ans = sort(arr);
        System.out.println("\narray after sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(ans[i]+"  ");
        }
    }
}
