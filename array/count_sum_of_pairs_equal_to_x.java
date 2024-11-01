package array;
import java.util.Scanner;
public class count_sum_of_pairs_equal_to_x {
    static int findPairs(int[] arr , int value)
    {
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i] + arr[j] == value)
                {
                     ans++;
                    System.out.println(ans +" = "+arr[i]+" "+arr[j]);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("enter element :  ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value which you want to find sum");
        int value = sc.nextInt();
        System.out.println("Total no of pairs = "+findPairs(arr,value));
    }
}
