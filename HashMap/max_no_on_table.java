package HashMap;
import java.util.*;
public class max_no_on_table {
    public static void main(String[] args) {
        int[] nums = {2 , 1 , 1 , 3 , 2 ,3};
        HashSet<Integer>st = new HashSet<>();
        int max = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int a = nums[i];
            if(st.contains(a)){
                st.remove(a);
            }
            else
            {
                st.add(a);
                max = Math.max(max,st.size());
            }
        }
        System.out.println(max);
    }
}
