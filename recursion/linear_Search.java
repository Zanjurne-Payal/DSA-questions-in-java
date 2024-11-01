package recursion;
import java.util.Scanner;
public class linear_Search {
    static boolean search(int[] arr , int n ,int idx){
        if(idx == arr.length)return false;
        if(n == arr[idx])return true;
        return search(arr , n , idx+1);
    }
    static int search_index(int[] arr , int n , int idx){
        if(idx == arr.length)return -1;
        if(n == arr[idx])return idx;
        return search_index(arr , n , idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1 , 34 , 13 , 64 , 13 , 4 , 2 , 1 , 13 , 5};
        System.out.println("Enter the number for search");
        int n = sc.nextInt();
        System.out.println("Is element present? :"+search(arr , n , 0));
        System.out.println("The index where element is present :"+search_index(arr , n , 0));
    }
}
