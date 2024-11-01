package binery_search;
import java.util.Scanner;
public class find_last_occurance {
    static int search(int[] arr, int x , int str , int end)
    {
        int ans = -1;
        if(str > end)return ans ;
        int mid = (str+end)/2;
        if(arr[mid] == x){
            ans = x;
            search(arr,x,mid+1,end);
        }
        else if(x < arr[mid])
        {
            search(arr,x,str,mid-1);
        }
        else{
            search(arr , x ,mid+1, end);
        }
        return ans;
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
        System.out.println(search(arr, target,0,arr.length-1));

    }
}
