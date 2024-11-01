package Sorting_methods;
import java.util.Scanner;
public class separate_negative_positive_values {
    static void sort(int[] arr){
        int i = 0 , j = arr.length-1;
        while(i < j)
        {
            while(arr[i] < 0 )i++;
            while(arr[j] >= 0)j--;
            if(i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
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
