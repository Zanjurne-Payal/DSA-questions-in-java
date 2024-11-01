package Sorting_methods;
import java.util.Scanner;
public class Redix_sort {
    static int find_max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > max)max = arr[i];
        }
        return max;
    }
    static void count_sort(int[] arr , int ele){
            int n = arr.length;
            int[] output = new int[n];
            int[] count = new int[10];
            //count array

                for(int j = 0 ; j < arr.length ; j++)
                {
                    int rem = (arr[j]/ele)%10;
                    count[rem]++;
                }

            //prefix sum
            for(int i = 1 ; i < count.length ; i++)
            {
                count[i] += count[i-1];
            }
            //output
            for(int i = n-1 ; i >= 0 ; i--)
            {
                int idx = count[(arr[i]/ele)%10]-1;
                output[idx] = arr[i];
                count[(arr[i]/ele)%10]--;
            }
            //copy all elements in origional array
            for(int i = 0 ; i < arr.length ; i++)
            {
                arr[i] = output[i];
            }
    }
    static void redix_sort(int[] arr)
    {
        int max = find_max(arr);
        for(int i = 1 ; max/i > 0 ; i *=10)
        {
            count_sort(arr , i);
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
        redix_sort(arr);
        System.out.println("Array After sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"    ");
        }
    }
}
