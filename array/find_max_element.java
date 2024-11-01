package array;
import java.util.Scanner;
public class find_max_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = 0 ;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("max value :"+max);
    }
}
