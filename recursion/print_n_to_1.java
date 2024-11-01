package recursion;
import java.util.Scanner;
public class print_n_to_1 {
    static void reverse_print(int n , int i) {
        if(i == n)
        {
            System.out.println(i);
            return;
        }
        reverse_print(n , i+1);
        System.out.println(i);
    }
    static void reverse_print_2(int n)
    {
        if(n == 1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        reverse_print_2(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int  n = sc.nextInt();
        reverse_print(n , 1);
        reverse_print_2(n);
    }
}
