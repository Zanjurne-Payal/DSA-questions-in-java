package Sorting_methods;
import java.util.Scanner;
public class sort_two_element_which_are_wrong_order {
    static void sort(int[] arr){
        if(arr.length < 2)return;
        int x = -1 , y = -1;
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i-1] > arr[i])
            {
                if(x == -1)
                {
                    x = i-1;
                    y = i;
                }
                else y = i;
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"    ");
        }
        sort(arr);
        System.out.println("\nArray After sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"    ");
        }
    }
}
