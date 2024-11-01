package binery_search;
import java.util.Scanner;
public class binery_search_using_recursion {
    static boolean search(int[] arr , int target,int start , int end){
        if(start > end)return false;
        int mid = (start+end)/2;
        if(mid == target)return true;
        else if(target > arr[mid])
        {
            return search(arr,target,mid+1,end);
        }
       else{
           return search(arr,target,start,mid-1);
        }
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
        System.out.println(search(arr, target,0,n));

    }
}
