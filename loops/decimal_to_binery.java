package loops;
import java.util.Scanner;
public class decimal_to_binery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal number");
        int n = sc.nextInt();
        int res = 0;
        while(n > 0)
        {
            int rem = n % 2;
            res = res*10+rem;
            n = n/2;
        }
        System.out.println(res);
    }
}
