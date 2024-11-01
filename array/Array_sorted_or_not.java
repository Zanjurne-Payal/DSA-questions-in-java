package array;
import java.util.Scanner;
public class Array_sorted_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean flag = true;
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(i+1+" elemet : ");
            arr[i] = sc.nextInt();
        }
        if(arr.length >1)
        {
            for(int i = 1 ; i < arr.length ; i++)
            {
                if(arr[i] < arr[i-1])
                {
                    flag = false;
                    break;
                }
            }
        }
        if(flag)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is unsorted");
        }
    }
}
