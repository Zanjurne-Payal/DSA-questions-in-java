package recursion;
import java.util.Scanner;
public class find_max_value_of_array {
    static int find_max(int[] arr , int idx , int max ,int i){
//        if(arr[idx] > max) max = arr[idx];
//        if(idx == 0)return max;
//        return find_max(arr , idx-1 , max);

       // method 2
        if(max < Math.max(arr[idx], arr[i])) max = Math.max(arr[idx] , arr[i]);
        if(i >= idx)return max;
        return find_max(arr, idx-1 , max , i+1);
    }
    static int Mam_Method(int[] arr , int idx){
        if(idx == arr.length-1)return arr[idx];
        int max = Mam_Method(arr , idx+1);
        return Math.max(arr[idx],max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {11, 23 , 45 ,22, 5 };
        int max = Integer.MIN_VALUE;
        System.out.println("Max = "+find_max(arr , arr.length-1 , max , 0));
        System.out.println("Max ="+Mam_Method(arr , 0));
    }
}
