package array;
import java.util.Scanner;
public class find_repeated_last_element {
    static int repeated_element(int[] arr) {
        int ans = -1;
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                }
            }
        }
        return ans;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("repeted element = " + repeated_element(arr));
    }
}