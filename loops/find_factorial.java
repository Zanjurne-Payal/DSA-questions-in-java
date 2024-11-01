package loops;
import java.util.Scanner;
public class find_factorial {
    public int i;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1 ; i <= num ; i++)
        {
            fact = fact*i;
        }
        System.out.println("factorial : "+fact);
    }
}
