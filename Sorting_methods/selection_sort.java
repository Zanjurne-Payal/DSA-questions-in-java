package Sorting_methods;
import java.util.Scanner;
// Space Complexity = O(1)
//Time complexity
//best case = O(n^2)
//Average case = O(n^2)    n * n
//worst case = O(n^2)
// inplace algorithm
// not Stable algorithm
public class selection_sort{
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int min_idx = i;
            for(int j = i ; j < n ; j++)
            {
                if(arr[j] < arr[min_idx])
                {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"    ");
        }
        selectionSort(arr);
        System.out.println("\nArray after sorting : ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"    ");
        }
    }
}

