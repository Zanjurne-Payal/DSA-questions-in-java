package array;

import java.util.Scanner;

public class sort_array_in_one_loop_using_2Pointer {
    static int[] sort_Array(int[] arr){
        //my logic = wrong code not work on all conditions
//        for(int i = 0 , j = arr.length-1 ; i < j ; i++ ,j--)
//        {
//            if(arr[i] == 1 && arr[j] == 0)
//            {
//                arr[i] = arr[i] + arr[j];
//                arr[j] = arr[i] - arr[j];
//                arr[i] = arr[i] - arr[j];
//            }
//        }
        //mam logic
        int left = 0 , right = arr.length-1;
        while(left < right)
        {
            if(arr[left] == 1 && arr[right] == 0)
            {
                arr[left] = arr[left] + arr[right];
                arr[right] = arr[left] - arr[right];
                arr[left] = arr[left] - arr[right];
                left++;
                right--;
            }
            if(arr[left] == 0)
            {
                left++;
            }
            if(arr[right] == 1)
            {
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 0 , 0 , 1 , 0 , 1 , 0};

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
