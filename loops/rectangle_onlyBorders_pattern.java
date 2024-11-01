package loops;
import java.util.Scanner;
public class rectangle_onlyBorders_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enters no of rows");
        int r = sc.nextInt();
        System.out.println("Enter no of columns");
        int c = sc.nextInt();
        for(int i = 1 ; i <= r ; i++)
        {
            for(int j = 1 ; j <= c ; j++)
            {
                if( i == 1 || i == r || j == 1 || j == c )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
