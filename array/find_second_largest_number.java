package array;
import java.util.Scanner;
public class find_second_largest_number {
    static int second_largest(int[] arr)
    {
        int second_large = Integer.MIN_VALUE;
        int large = Integer.MIN_VALUE;
        //my method
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }
            else if(arr[i] > second_large && arr[i] < large)
            {
                second_large = arr[i];
            }
        }
    //the issue in 1st method is when dublicate element entern in array  the large and second large no is same
        //in 1st method = ex when array is 4 , 3 , 2 , 4;  large = 4 & second_large = 4
        //in 1st method = ex when array is 4 , 3 , 2 , 4;  large = 4 & second_large = 3
        //mam method
//        for(int i = 0 ; i < arr.length ; i++)
//        {
//            if(arr[i] >= large)
//            {
//                large = arr[i];
//            }
//        }
//        for(int i = 0 ; i < arr.length ; i++)
//        {
//            if(arr[i] == large)
//            {
//                arr[i] = Integer.MIN_VALUE;
//            }
//        }
//        for(int i = 0 ; i < arr.length ; i++)
//        {
//            if(arr[i] >= second_large)
//            {
//                second_large = arr[i];
//            }
//        }
        return second_large;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("second largest number = "+second_largest(arr));
    }
}
