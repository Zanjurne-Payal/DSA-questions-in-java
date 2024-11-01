package Sorting_methods;
import java.util.Scanner;
public class quick_sort {
    static int quick(int[] arr , int st , int end){
        int p = arr[st];
        int cnt = 0;
        for(int i = st+1 ; i <= end ; i++)
        {
            if(arr[i] <= p) cnt++;
        }
        int pidx = st+cnt;

        int temp1 = arr[pidx];
        arr[pidx] = arr[st];
        arr[st] = temp1;


        int i = st , j = end;
        while(i < pidx && j > pidx )
        {
            while(arr[i] <= p)i++;
            while(arr[j] > p)j--;
            if(i < pidx && j > pidx)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pidx;
    }
    static void sort(int[] arr , int st , int end){
        if(st >= end)return;
        int p = quick(arr , st , end);

        sort(arr , st , p-1);
        sort(arr , p+1 , end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("array before sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(arr[i]+"  ");
        }
        sort(arr , 0 , arr.length-1);
        System.out.println("array After sorting");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(arr[i]+"  ");
        }
    }
}
