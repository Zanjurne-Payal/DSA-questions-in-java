package binery_search;
import java.util.Scanner;
public class peak_index_mountain_array {
    static int searchPeak(int[] arr)
    {
        int st = 0 , end = arr.length-1;
        //int ans = -1;
        while(st <= end)
        {
            int mid = st+(end-st)/2;
            //my logic wich work better
            if((mid == 0 ||arr[mid] > arr[mid - 1]) && (mid == arr.length-1 ||arr[mid] > arr[mid + 1]))return arr[mid];
            else if(arr[mid] < arr[mid - 1])
            {
                end = mid-1;
            }
            else{
                st = mid+1;
            }

//            if(arr[mid] < arr[mid+1])
//            {
//                ans = mid+1;
//                st = mid+1;
//            }
//            else{
//                end = mid-1;
//            }
        }
 //       return arr[ans];
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1 , 2 , 3 , 4 , 5 , 4 , 3 , 2 ,1};
        System.out.println("peak element : "+searchPeak(arr));
    }
}
