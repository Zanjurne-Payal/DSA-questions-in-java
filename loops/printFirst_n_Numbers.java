package loops;
import java.util.Scanner;
public class printFirst_n_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number while you want to print numbers");
        num = sc.nextInt();
        int i = 1;
        while(i <= num)
        {
            System.out.println(i);
            i++;
        }
    }
}
