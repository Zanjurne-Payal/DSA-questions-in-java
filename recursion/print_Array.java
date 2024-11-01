package recursion;
import java.util.Scanner;
public class print_Array {
    //my logic
//    static void printArr(int[] arr , int idx){
//        if(idx == -1) return;
//        printArr(arr , idx-1);
//        System.out.println(arr[idx]);
//    }
    static void printArr(int[] arr , int idx){
        if(idx == arr.length) return;
        System.out.println(arr[idx]);
        printArr(arr , idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1 , 2 , 3 , 4 , 5};
        //printArr(arr , arr.length-1);
        printArr(arr , 0);
    }
}
