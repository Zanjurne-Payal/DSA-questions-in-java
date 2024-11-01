package ifElse;
import java.util.Scanner;
public class grstestOf3_NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        // Best way
        if(a >= b){
            if( a >= c)
            {
                System.out.println("Gratest number = "+a);
            }
            else{
                System.out.println("Gratest Number = "+c);
            }
        }
        else
        {
            if(b >= c)
            {
                System.out.println("garteat No = "+b);
            }
            else{
                System.out.println("gratest Number = "+c);
            }
        }
        //another way
//        if(a >= b)
//        {
//            if(a >=c)
//            {
//                System.out.println("Gratest No = "+a);
//            }
//        }
//        else if(c >= b)
//        {
//            if(c >= a)
//            {
//                System.out.println("Gratest No ="+c);
//            }
//
//        }
//        else
//        {
//            System.out.println("Gratest No = "+b);
//        }
    }
}
