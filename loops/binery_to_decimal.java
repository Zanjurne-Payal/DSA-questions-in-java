package loops;
import java.util.Scanner;
public class binery_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binery number");
        int n = sc.nextInt();
        int res = 0;
        for(int i = 1 ; n > 0 ; i= i*2)
        {
            int rem = n % 10;
            res = res+rem * i;
            n = n / 10;
        }
        System.out.println(res);
    }
}
