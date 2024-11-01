package array;
import java.util.Scanner;
public class sort_array_by_even_1st_odd_last {
    static int[] sort_Array(int[] arr){
        int start = 0 , end = arr.length-1;
        while(start < end)
        {
            if(arr[start] % 2 != 0 && arr[end] % 2 == 0)
            {
                arr[start] = arr[start] + arr[end];
                arr[end] = arr[start] - arr[end];
                arr[start] = arr[start] - arr[end];
                start++;
                end--;
            }
            if(arr[start] % 2 == 0) start++;
            if(arr[end] % 2 != 0) end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1 ,2 , 3 , 4 , 5 , 6 , 7 , 8};
        System.out.println("Array before sorting :");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }

        int[] sort = sort_Array(arr);

        System.out.println("\nArray After sorting :");
        for(int i = 0 ; i < sort.length ; i++)
        {
            System.out.print(sort[i]+" ");
        }
    }
}
