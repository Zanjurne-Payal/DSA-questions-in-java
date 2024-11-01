package ifElse;
import java.util.Scanner;
public class two_points_liesOn_X_OR_Y_axies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.println("Enter x and y");
        x = sc.nextInt();
        y = sc.nextInt();
        if(x == 0 && y == 0)
        {
            System.out.println("the point lies on origin");
        }
        else if(x == 0)
        {
            System.out.println("point lies on y axis");
        }
        else if(y == 0)
        {
            System.out.println("point lies on x axis");
        }
        else
        {
            System.out.println("Condition not match");
        }
    }
}

