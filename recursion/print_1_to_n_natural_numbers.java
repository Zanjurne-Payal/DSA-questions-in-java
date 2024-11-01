package recursion;
import java.util.Scanner;
public class print_1_to_n_natural_numbers {
    static void print_Natural_Numbers(int n){
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        print_Natural_Numbers(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        print_Natural_Numbers(n);
    }
}
