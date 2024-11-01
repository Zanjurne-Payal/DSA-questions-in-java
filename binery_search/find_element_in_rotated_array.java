package binery_search;
import java.util.Scanner;
public class find_element_in_rotated_array {
    static int find_min(int[] arr)
    {
        //linear approch
//        for(int i = 1 ; i < arr.length ; i++)
//        {
//            if(arr[i] < arr[i-1]) return i;
//        }
        int st = 0 , end = arr.length-1;
        int ans = -1;
        while(st <= end)
        {
            int mid = st+(end-st)/2;
            if(arr[mid] > arr[arr.length-1])
            {
                st = mid+1;
            }
            else
            {
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
    static int search(int[] arr, int n){
        int ans = -1;
        int st1 = 0 ;
        int st2 = find_min(arr);
        int end1 = st2-1;
        int end2 = arr.length-1;
        int x,y;
        if(arr[st1] < n && arr[end1] > n)
        {
             x = st1;
             y = end1;
        }
        else{
            x = st2;
            y = end2;
        }
        while(x <= y)
        {
          int mid = x+(y-x)/2;
          if(n == arr[mid])return mid;
          else if(arr[mid] > n)
          {
              y = mid-1;
          }
          else{
              x = mid+1;
          }
        }
        return ans;
    }
    static int search2(int[] arr , int n)
    {
        int st = 0 , end = arr.length-1;
        while(st <= end)
        {
            int mid = st+(end-st)/2;
            if(arr[mid] == n)
            {
                return mid;
            }
            else if(arr[mid] < arr[end])
            {
                if(n > arr[mid] && n <= arr[end])
                {
                    st = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else
            {
                if(n >= arr[st] && n < arr[mid])
                {
                    end = mid-1;
                }
                else {
                    st = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3 , 4 , 5 , 6 , 7 , 8 ,1 , 2};
        System.out.println("Enter element to search");
        int n = sc.nextInt();
        System.out.println("Array ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        int ele = search(arr,n);
        int ele2 = search2(arr,n);
        System.out.println("\nelement value at index = "+ele+"      "+ele2);
    }
}
