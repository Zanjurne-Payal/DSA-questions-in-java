package binery_search;
import java.util.Scanner;
public class binery_search_using_loop {
    static boolean search(int[] arr , int target){
        int start = 0 ;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = (start+end)/2;
            if(target == arr[mid])
            {
               return true;
            }
            else if(target > arr[mid])
            {
                System.out.println(start);
                start = mid+1;
                System.out.println(start);
            }
            else
            {
                end = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements in sorting order ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int target = sc.nextInt();
        System.out.println(search(arr, target));
    }
}
