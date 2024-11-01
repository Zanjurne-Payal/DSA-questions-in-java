package binery_search;
import java.util.Scanner;
public class find_sqrt_round_of_nearest_floor_value {
//    static int sqrt(int str ,int n, int end){
//        int ans = 1;
//        while(str <= end)
//        {
////           if(str*str <= n){
////               ans = str;
////           }
////           str++;
//            int mid = (str+end)/2;
//            if(mid*mid == n)
//            {
//                return mid;
//            }
//            else if(mid*mid < n)
//            {
//                ans = mid;
//               str = mid+1;
//            }
//            else{
//            end = mid-1;
//            }
//        }
//        return ans;
//    }
    static int sqrt(int str , int n , int end)
    {
        int ans = 1;
        int mid = (str+end)/2;
        if(str > end) return ans;
        if(mid*mid == n) {
            ans = mid;
            sqrt(mid+1 , n , end);
        }
        else if(mid*mid < n)
        {
            ans = mid;
            sqrt(mid+1 , n , end);
        }
        else{
            sqrt(str , n , mid-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the squre");
        int sqr = sc.nextInt();
        int ans = sqrt(0,sqr,sqr);
        System.out.println("Sqrt of "+sqr+" is "+ans);
    }
}
