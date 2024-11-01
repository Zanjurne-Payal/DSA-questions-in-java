package array;
import java.util.Scanner;
public class find_repeated_1st_Element_from_array {
    static int repeated_element(int[] arr){
        for(int i = 0 ; i <= arr.length ; i++)
        {
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i] == arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("repeted element = "+repeated_element(arr));
    }
}
