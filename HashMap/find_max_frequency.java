package HashMap;
import java.util.*;
public class find_max_frequency {
    public static void main(String[] args) {
        int[] arr = {1 , 5 , 7 , 2 , 2 , 8, 2, 6, 3 ,3 ,2 ,1 };
        Map<Integer , Integer> freq = new HashMap<>();
        for(int ele : arr)
        {
            if(!freq.containsKey(ele))
            {
                freq.put(ele , 1);
            }
            else
            {
                freq.put(ele,freq.get(ele)+1);
            }
        }
        int key = -1;
        int max = -1;
        System.out.println(freq);
        for(var e : freq.entrySet())
        {
            if(max < e.getValue())
            {
                max = e.getValue();
                key = e.getKey();
            }
        }
        System.out.printf("key = %d and value = %d",key,max);
    }
}
