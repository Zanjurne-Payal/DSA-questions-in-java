package Sorting_methods;
import java.util.Scanner;
public class merge_sort {
    static void merge(int[] arr , int l , int r , int mid){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0 ; i < n1 ; i++) left[i] = arr[l+i];
        for(int j = 0 ; j < n2 ; j++) right[j] = arr[mid+j+1];
        int i = 0;
        int j = 0;
        int k = l;
        while(i < n1 && j < n2)
        {
            if(left[i] < right[j])
            {
                arr[k] = left[i];
                i++;
                k++;
            }
            else{
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while(i < n1)
        {
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j < n2)
        {
            arr[k] = right[j];
            k++;
            j++;
        }
    }
    static void sort(int[] arr , int l , int r){
        if(l >= r) return;
        int mid = (l+r)/2;
        sort(arr , l , mid);
        sort(arr ,mid+1 , r);
        merge(arr , l , r , mid);
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
        sort(arr,0,n-1);
        System.out.println("Array After sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"    ");
        }
    }
}
