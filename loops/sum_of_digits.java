package loops;
import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp =n;
        int rem =0;
        int sum = 0;
        while(temp != 0)
        {
            rem = temp % 10;
            sum = sum+rem;
            temp =temp / 10;
        }
        System.out.println("the sum of number "+n+" is : "+sum);
    }
}