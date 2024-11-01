package ifElse;
import java.util.Scanner;
public class Area_Parameter_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int l = sc.nextInt();
        System.out.println("Enter the breath of rectangle");
        int r = sc.nextInt();
        int area = l*r;
        int parameter = 2*(l+r);
        System.out.println("The area of rectangle = "+area);
        System.out.println("The parameter of rectangle = "+parameter);
        if(area > parameter)
        {
            System.out.println("Area is grater than parameter");
        }
        else if(parameter > area){
            System.out.println("Parameter is grater than Area");
        }
        else{
            System.out.println("both are same");
        }
    }
}
