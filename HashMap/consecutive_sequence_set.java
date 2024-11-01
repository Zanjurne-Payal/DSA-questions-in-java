package HashMap;
import java.util.*;
public class consecutive_sequence_set {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7,7,8,9};
        HashSet<Integer> st = new HashSet<>();
        for(int i : nums)
        {
            st.add(i);
        }
        int max = 0;
        int streak = 1;
        for(int i : st)
        {
            if(!st.contains(i-1)){
                int cur = i;
                while(st.contains(cur+1))
                {
                    streak++;
                    cur++;
                }
                max = Math.max(max,streak);
            }
        }
        System.out.println(streak);
    }
}
