package array;
import java.util.*;
public class vector_check {
    public void merge(Vector<Integer> nums1, int m, Vector<Integer> nums2, int n) {
        int i = 0,a=0,b=0;
        while(nums1.size()!= n+m)
        {
            if(!nums1.isEmpty()) a = nums1.get(i);
            if(!nums2.isEmpty()) b = nums2.get(i);
            if(a > b)
            {
                nums1.add(i,b);
                i++;
            }
            else
            {
                if(nums1.isEmpty()){
                    nums1.add(i,b);
                }
                else
                {
                    nums1.add(i+1,b);
                }
                i++;
            }
        }
        System.out.println(nums1);
    }
    public static void main(String[] args) {
        Vector<Integer> nums1 = new Vector<>();

        int n = nums1.size();
        Vector<Integer> nums2 = new Vector<>();
        nums2.add(1);

        int m = nums2.size();

        System.out.println(nums1);
    }
}
