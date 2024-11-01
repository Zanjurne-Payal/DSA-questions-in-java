package leetcode;

public class remove_k_in_array {
    static public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0 ; i < nums.length;i++)
        {
            if(nums[i] != val) {
            nums[k] = nums[i];
            k++;
            }
        }
        for(int i = 0 ; i < k ; i++)
        {
            System.out.print(nums[i]+"     ");
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr = {3 , 2 , 2, 3};
        int n = 3;
        System.out.println("\n"+removeElement(arr,n));
    }
}
