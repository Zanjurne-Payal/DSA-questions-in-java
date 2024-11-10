package Backtracking;
import java.util.*;
public class permutations2 {
    static List<List<Integer>> permute(int[] arr)
    {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isValid = new boolean[arr.length];
        helper(arr , ds , isValid , ans);
        return ans;
    }

    private static void helper(int[] arr, List<Integer> ds, boolean[] isValid, List<List<Integer>> ans) {
        int n = arr.length;
        if(ds.size() == n)
        {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < ds.size(); i++) {
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }
        for(int i = 0 ; i < n ; i++)
        {
            if(isValid[i] == false)
            {
                ds.add(arr[i]);
                isValid[i] = true;
                helper(arr,ds,isValid,ans);
                isValid[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }
}
