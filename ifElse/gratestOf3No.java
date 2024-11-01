package ifElse;
import java.util.Scanner;
public class gratestOf3No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a >= b && a >= c)
        {
            System.out.println("gratest Number = "+a);
        }
        else if( b >= a && b >= c)
        {
            System.out.println("gratest Number = "+b);
        }
        else{
            System.out.println("gratest Number = "+c);
        }
    }
}
