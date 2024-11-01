package loops;
import java.util.Scanner;
public class reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int temp = n;
        int rem = 0;
        int reverse = 0;
        while(temp != 0)
        {
            rem = temp % 10;
            reverse = reverse * 10 +rem;
            temp = temp / 10;
        }
        System.out.println("reverse No :"+reverse);
    }
}
