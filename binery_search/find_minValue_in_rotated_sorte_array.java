package binery_search;
import java.util.Scanner;
public class find_minValue_in_rotated_sorte_array {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3 , 4 , 5 , 6 , 7 , 8 ,1 , 2};
        System.out.println("Array ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        int min = find_min(arr);
        System.out.println("\nmin value at index = "+min);
    }
}
