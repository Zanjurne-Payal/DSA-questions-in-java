package loops;
import java.util.Scanner;
public class peramid_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
//        int r2=r/2;
//        int spc = r-1;
//        int num=1;
//
//        for(int i = 1 ; i <=r/2+1; i++)
//        {
//            for(int j = 1 ; j<=r2 ; j++)
//            {
//                System.out.print(" ");
//
//            }
//
//            for(int k = 1 ; k<=num ; k++)
//            {
//                System.out.print("*");
//
//            }
//            System.out.println();
//            r2--;
//            num+=2;
//        }
        for(int i = 1 ; i <= r ; i++)
        {
            for(int j = 1 ; j <= r-i ; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1 ; k <= (2 * i)-1 ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
