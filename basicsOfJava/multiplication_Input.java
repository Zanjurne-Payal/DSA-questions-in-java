package basicsOfJava;
import java.util.Scanner;
public class multiplication_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Multiplication is : "+a*b);
    }
}
