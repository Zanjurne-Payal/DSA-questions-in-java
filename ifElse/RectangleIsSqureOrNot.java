package ifElse;
import java.util.Scanner;
public class RectangleIsSqureOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle");
        int length = sc.nextInt();
        System.out.println("Enter breath of Rectangle");
        int breath = sc.nextInt();
        if(length == breath )
        {
            System.out.println("It is squre");
        }
    }
}
