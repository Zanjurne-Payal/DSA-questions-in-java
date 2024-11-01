package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class dublicate_sorted {
    static public int removeDuplicates(int[] nums) {
        int a = 0;
        int k = 0;
        for(int i = 2 ; i < nums.length-1 ; i++)
        {
            if(nums[i] == nums[i-1])
            {
                if(nums[i] == nums[a])
                {
                    nums[a] = nums[i];
                    nums[a+1] = nums[i];
                    a = a+2;
                    k = k+2;
                    System.out.println(nums[a]+" "+nums[a+1]);
                }
            }
            else
            {
                nums[a] = nums[i];
                System.out.println(nums[a]);
                a++;
                k++;
            }
        }
        return k;
    }
    static public int majorityElement(int[] nums) {
        int major = 0;
        int max = 0;

            HashMap<Integer , Integer> mp = new HashMap<>();
            for(int i = 0 ; i < nums.length ; i++)
            {
                if(!mp.containsKey(nums[i]))
                {
                    mp.put(nums[i],1);
                }
                else
                {
                    mp.put(nums[i] , mp.get(nums[i])+1);
                }
            }
            for(var i : mp.entrySet())
            {
                if(i.getValue() > max){
                    max = i.getValue();
                    major = i.getKey();
                }
                System.out.println(major);
            }

        return major;
    }
    public static void main(String[] args) {
        int[] arr = {2 , 2 , 2 , 3,3,3,3,3 , 4 , 4 };
        System.out.println("\n"+majorityElement(arr));
    }
}
