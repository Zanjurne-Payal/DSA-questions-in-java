package recursion;
import java.util.Scanner;
public class sum_of_array_elements {
    static int sum(int[] arr , int idx){
        if(idx == arr.length )return 0;
        return arr[idx]+sum(arr , idx+1);
    }
    public static void main(String[] args) {
        int[] brr = {};
        int[] arr = {1 , 2 , 3 , 4 , 5 , -6 };
        System.out.println("Sum of elements : "+sum(arr ,0));
        System.out.println("Sum of empty array : "+sum(brr , 0));
    }
}
