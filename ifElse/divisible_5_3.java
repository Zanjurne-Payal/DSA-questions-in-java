package ifElse;
import java.util.Scanner;
public class divisible_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num % 3 == 0 && num % 5 == 0) //num % 15
        {
            System.out.println("Number is divisible by 3 and 5");
        }
        else if(num % 3 == 0 || num % 5 == 0)
        {
            System.out.println("The number is divisible by 3 or 5");
        }
//        else if(num % 3 == 0 && num % 5 != 0)
//        {
//            System.out.println("Number is divisible by 3 but not 5");
//        }
//        else if(num % 5 == 0 && num % 3 != 0)
//        {
//            System.out.println("Number is divisible by 5 but not 3");
//        }
        else {
            System.out.println("Not divisible");
        }
    }
}
