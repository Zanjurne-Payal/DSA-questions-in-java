package Sorting_methods;
import java.util.Scanner;
// Space Complexity = O(1)
//Time complexity
//best case = O(n)
//Average case = O(n^2)    n * n
//worst case = O(n^2)
// inplace algorithm
//Stable algorithm
public class insertion_sort {
    static void sort(int[] arr){
        for(int i = 1 ; i < arr.length ; i++)
        {
            int j = i;
            while(j > 0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"     ");
        }

        sort(arr);

        System.out.println("\nArray After sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"     ");
        }
    }
}
