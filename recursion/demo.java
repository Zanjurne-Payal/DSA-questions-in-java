package recursion;
import java.util.Scanner;
public class demo {
    static int rec(int[] arr , int start , int end){
        int ans = 0;
        if(start == arr.length-1) return ans;
        if((arr[start+1]-arr[start]) < (arr[start+2]-arr[start]))
        {
            ans = rec(arr , start+1 ,end)-arr[start];
        }
        else{
            ans = rec(arr , start+2 ,end)-arr[start];
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
            arr[i] = sc.nextInt();
        }
        int ans = rec(arr,0,n-1);
        System.out.println(ans);

    }
}
