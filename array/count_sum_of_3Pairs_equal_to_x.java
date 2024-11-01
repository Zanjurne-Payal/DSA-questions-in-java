package array;
import java.util.Scanner;
public class count_sum_of_3Pairs_equal_to_x {
    static int calculate(int[] arr , int sum){
        int ans = 0 ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i+1 ; j < arr.length ; j++)
            {
                for(int k = j+1 ; k < arr.length ; k++)
                {
                    if(arr[i] + arr[j] + arr[k] == sum)
                    {
                        ans++;
                        System.out.println(ans+" : "+arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number to calculate sum");
        int sum = sc.nextInt();
        System.out.println("The number of triplets which is sum = "+sum+" is : "+calculate(arr,sum));
    }
}
