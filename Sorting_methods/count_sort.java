package Sorting_methods;
import java.util.Scanner;
public class count_sort {
    //my logic
    static int find_max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > max)max = arr[i];
        }
        return max;
    }
//    static void sort(int[] arr){
//          int max = find_max(arr);
//        int[] count = new int[max+1];
//        for(int i = 0 ; i < count.length ; i++)
//        {
//            int cnt = 0;
//           for(int j = 0 ; j < arr.length ; j++)
//           {
//               if(i == arr[j])cnt++;
//           }
//           count[i] = cnt;
//        }
//        int k = 0;
//        for(int i = 0 ; i < count.length ; i++)
//        {
//            for(int j = 0 ; j < count[i] ; j++)
//            {
//                if(count[i] >0)
//                {
//                    arr[k] = i;
//                    k++;
//                }
//            }
//        }
//    }

    static void sort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = find_max(arr);
        int[] count = new int[max+1];
        //count array
        for(int i = 0 ; i < count.length ; i++)
        {
            int cnt = 0;
            for(int j = 0 ; j < arr.length ; j++)
            {
               if(i == arr[j])cnt++;
            }
            count[i] = cnt;
        }
        //prefix sum
        for(int i = 1 ; i < count.length ; i++)
        {
            count[i] += count[i-1];
        }
        //output
        for(int i = n-1 ; i >= 0 ; i--)
        {
                int idx = count[arr[i]]-1;
                output[idx] = arr[i];
                count[arr[i]] = count[arr[i]]-1;
        }
        //copy all elements in origional array
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = output[i];
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
        System.out.println("Array After sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"    ");
        }
    }
}
