package ifElse;
import java.util.Scanner;
public class divisibleBy_5Or3_not_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        // if((num % 5 == 0 || num % 3 == 0) && num % 15 != -)  && higher priority than ||
        if( num % 5 == 0 || num % 3 == 0)
        {
            if(num % 15 != 0)
            {
                System.out.println("Number is divisible by 5 or 3 but not 15");
            }
            else{
                System.out.println("Number is divisible by 5 or 3  and 15");
            }
        }
        else
        {
            System.out.println("Number is not divisible by 3 or 5");
        }
    }
}
