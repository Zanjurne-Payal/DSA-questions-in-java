package recursion;
import java.util.Scanner;
public class alternative_sum_of_n_natural_numbers {
    static int alt_sum(int n){
        if(n == 0)return 0;
        if(n % 2 == 0)return alt_sum(n-1)-n;
        else return alt_sum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println(alt_sum(n));
    }
}
