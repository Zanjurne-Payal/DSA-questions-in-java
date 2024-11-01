package loops;
import java.util.Scanner;
public class sum_of_usser_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println("print -1 to stop");
        int num= sc.nextInt();
        int sum = 0;
        while(num != -1)
        {
            sum += num;
            System.out.println("Enter the number");
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}
