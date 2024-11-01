package recursion;
import java.util.Scanner;
public class subsequents_of_number {
    static void subsequent(int[] arr , int n ,  int idx ,int ans){
        if(idx >= n)
        {
            System.out.println(ans);
            return;
        }
            subsequent(arr , n , idx+1 , ans);
            subsequent(arr , n , idx+1 , ans+arr[idx]);
    }
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3};
        subsequent(arr , arr.length , 0 , 0);
    }
}
