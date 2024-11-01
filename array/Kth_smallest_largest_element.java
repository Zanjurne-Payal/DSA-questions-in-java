package array;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_smallest_largest_element {
    static int[] brr(int[] arr , int ele){
        Arrays.sort(arr);
        int[] ans = new int[2];
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(ele == i)
            {
                ans[0] = arr[i];
                ans[1] = arr[arr.length - i-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element ");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter which largest or smallest number you want");
        int ele = sc.nextInt();
        int[] ans = brr(arr,ele);
        System.out.println("smallest : " + ans[0]);
        System.out.println("Largest : " + ans[1]);
    }
}
