package Sorting_methods;
import java.util.Scanner;
public class array_of_0_1_2_sort_it {
    static void sort(int[] arr){
//        int[] output = new int[arr.length];
//        int[] count = new int[3];
//        for(int i = 0 ; i < count.length ; i++)
//        {
//            int cnt = 0;
//            for(int j = 0; j < arr.length ; j++) {
//                if(i == arr[j])cnt++;
//            }
//            count[i] = cnt;
//        }
//        for(int i = 1 ; i < count.length ; i++)
//        {
//            count[i] += count[i-1];
//        }
//        for(int i = arr.length-1 ; i >= 0 ; i--)
//        {
//            int idx = count[arr[i]]-1;
//            output[idx] = arr[i];
//            count[arr[i]]--;
//        }
//        for(int i = 0 ; i < arr.length ; i++)
//        {
//            arr[i] = output[i];
//        }

        //best approch
//        int cnt0 , cnt1 , cnt2;
//        cnt0 = cnt1 = cnt2 = 0;
//        for(int i = 0 ; i < arr.length ; i++)
//        {
//            if(arr[i] == 0)cnt0++;
//            else if(arr[i] == 1)cnt1++;
//            else cnt2++;
//        }
//        int k = 0;
//        while(cnt0-- > 0)
//        {
//            arr[k++] = 0;
//        }
//        while(cnt1-- > 0)
//        {
//            arr[k++] = 1;
//        }
//        while(cnt2-- > 0)
//        {
//            arr[k++] = 2;
//        }

        //bestest approch
        int low = 0 , mid = 0 , high = arr.length-1;
        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
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
