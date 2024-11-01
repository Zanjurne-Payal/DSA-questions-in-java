package ifElse;
import java.util.Scanner;
public class Three_digit_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num >= 100 && num <=999){
            System.out.println("The number is Three digit");
        }
        else if(num >=10 && num <=99){
            System.out.println("The number is two digit");
        }
    }
}
