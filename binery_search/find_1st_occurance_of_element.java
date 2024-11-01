package binery_search;
import java.util.Scanner;
public class find_1st_occurance_of_element {
    static int search(int[] arr, int ele,int start ,int end){
        int ans = -1;
        if(start > end)return ans;
        int mid = (start+end)/2;
        if(arr[mid] == ele) {
            ans = mid;
            search(arr,ele,start,mid-1);
        }
        else if(ele < arr[mid]){
            search(arr,ele,start,mid-1);
        }
        else{
            search(arr,ele,mid+1,end);
        }
        return ans;
    }
    static int search2(int[] arr , int x){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int ans = -1;
        while(st <= end)
        {
            int mid = (st+end)/2;
            if(arr[mid] == x)
            {
                ans = mid;
                end = mid-1;
            }
            else if(x < arr[mid])
            {
                end = mid-1;
            }
            else
            {
                st = mid+1;
            }
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
        System.out.println(search(arr, target,0,arr.length));


    }
}
