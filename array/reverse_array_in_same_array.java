package array;

import java.util.Scanner;

public class reverse_array_in_same_array {
    static int[] reverse(int[] arr){
        for(int i = 0 , j = arr.length-1  ;   i < j  ;   i++ , j--)
        {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
        return arr;
    }
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
        int[] ans = reverse(arr);
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(ans[i]+"   ");
        }
    }
}
