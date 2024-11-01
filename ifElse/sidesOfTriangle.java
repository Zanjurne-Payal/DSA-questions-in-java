package ifElse;
import java.util.Scanner;
public class sidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of triangle");
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if( (a+b)>c && (b+c)>a && (a+c)>b)
        {
            System.out.println("it is a tringle");
        }
        else
        {
            System.out.println("not a tringle");
        }
    }
}
