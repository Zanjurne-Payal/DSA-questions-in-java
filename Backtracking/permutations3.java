package Backtracking;
import java.util.*;

public class permutations3 {
    static List<List<Integer>> permute(int[] arr)
    {
        List<List<Integer>>ans = new ArrayList<>();
        helper(arr , 0 , ans);
        return ans;
    }

    private static void helper(int[] arr, int idx , List<List<Integer>> ans) {
        int n = arr.length;
        if(idx == n-1){
            List<Integer> list = new ArrayList<>();
            for (int j : arr) {
                list.add(j);
            }
            ans.add(list);
            return;
        }
        for(int i = idx ; i < n ; i++)
        {
            swap(i , idx , arr);
            helper(arr , idx+1 , ans);
            swap(i , idx , arr);
        }
    }

    private static void swap(int i, int i1 , int[] arr) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3};
        System.out.println(permute(arr));
    }
}
