package array;
import java.util.Scanner;
public class sort_array_traditional_Method {
    static int[] sort_Array(int[] arr){
        int zero = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 0)
            {
                zero++;
            }
        }
        // My logic
//        for(int i = 0 , j = zero ; i < zero && j < arr.length  ; i++ , j++)
//        {
//            arr[i] = 0;
//            arr[j] = 1;
//        }
        //Mam logic
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(i < zero)
            {
                arr[i] = 0;
            }
            else
            {
                arr[i] = 1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1 , 1 , 0 , 0 , 1 , 0 , 0 , 1};

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
