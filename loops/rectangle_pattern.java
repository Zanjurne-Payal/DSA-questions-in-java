package loops;
import java.util.Scanner;
public class rectangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.println("enter no of rows");
        r = sc.nextInt();
        System.out.println("Enter no of columns");
        c = sc.nextInt();
        for(int i = 1 ; i <= r ; i++)
        {
            for(int j = 1 ; j <= c ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
