package recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class print_idx_where_n_is_present {
    //method 1
//    static void find_all_idx(int[] arr , int n , int idx){
//        if(idx >= arr.length) return;
//        if(arr[idx]==n) System.out.print(idx+"  ");
//        find_all_idx(arr , n , idx+1);
//    }
    //method 2
    static ArrayList<Integer> find_all_idx(int[] arr , int n , int idx){
        ArrayList<Integer> li = new ArrayList<>();

        if(idx == arr.length-1)return li;

        if(arr[idx] == n)li.add(idx);

        li.addAll(find_all_idx(arr , n , idx+1));
        return li;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int[] arr = {1 , 3 , 5 , 3 , 7 ,3 , 3 ,8};//1 , 3 ,5 ,6
        System.out.println("indexes where "+n+" is present");
        //find_all_idx(arr , n , 0);
        System.out.println(find_all_idx(arr , n ,0));
    }
}
