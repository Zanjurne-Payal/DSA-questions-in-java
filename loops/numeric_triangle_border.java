package loops;
import java.util.Scanner;
public class numeric_triangle_border {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n-i ; j++)
            {
                System.out.print(" ");
            }
            int con = (i*2)-1;
            for(int k = 1 ; k <= con ; k++)
            {
                if(k == 1 || k == con || i == n)
                {
                    System.out.print(i);
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
