package Sorting_methods;
import java.util.ArrayList;
import java.util.Scanner;

public class bucket_sort {
    static void sort(double[] arr){
        int n = arr.length;
        //ArrayList<double>[] buckets = new ArrayList[n];
        //array list cant be created as array so it is not complete
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextDouble();
        }
        System.out.println("Array before sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"    ");
        }
        sort(arr);
        System.out.println("Array After sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"    ");
        }
    }
}
