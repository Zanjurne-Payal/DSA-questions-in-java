package ifElse;
import java.util.Scanner;
public class tree_points_online {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1,x2,x3,y1,y2,y3;
        System.out.println("Enter x1 x2 x3");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        x3 = sc.nextInt();
        System.out.println("Enter y1 y2 y3");
        y1 = sc.nextInt();
        y2 = sc.nextInt();
        y3 = sc.nextInt();
        double m1 = (y2 - y1)/(x2 - x1);
        double m2 = (y3 - y2)/(x3 - x2);
        if(m1 == m2){
            System.out.println("the points lies in same line");
        }
        else {
            System.out.println("three points does not lies in same line");
        }
    }
}
