package binery_search;
import java.util.*;
public class distribute_chocolate_to_students {
    static boolean divide(int[] arr , int n , int mid){
        int stud = 1;
        int choc = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > mid)return false;
            if(choc+arr[i] <= mid)
            {
                choc += arr[i];
            }
            else
            {
                stud++;
                choc = arr[i];
            }
        }
      return stud <= n;
    }
    static int distribute(int[] arr , int n)
    {
        if(arr.length < n)return -1;
        int st = 0 , end = 10000000 , ans = 0;
        while(st <= end)
        {
            int mid = st + (end - st)/2;
            if(divide(arr , n , mid))
            {
                ans = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        int[] choco = {5 , 3 , 1, 4 , 2};
        System.out.println(distribute(choco , n));
    }
}
