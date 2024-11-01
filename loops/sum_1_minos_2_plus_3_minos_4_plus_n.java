package loops;
import java.util.Scanner;
public class sum_1_minos_2_plus_3_minos_4_plus_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            if (i % 2 == 0)
            {
                sum = sum - i;
            }
            else
            {
                sum = sum +i;
            }
        }
        System.out.println(sum);
    }
}
