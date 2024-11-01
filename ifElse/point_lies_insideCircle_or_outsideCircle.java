package ifElse;
import java.util.Scanner;
public class point_lies_insideCircle_or_outsideCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 0 , y = 0 , r = 6;
        System.out.println("Enter x1, y1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        double point =((x - x1)*(x - x1))+((y - y1)*(y - y1));
        if(point > r)
        {
            System.out.println("The point is Outside the circle");
        }
        else if( point < r)
        {
            System.out.println("The point is Inside the Circle");
        }
        else {
            System.out.println("The point is on the circle");
        }
    }
}
