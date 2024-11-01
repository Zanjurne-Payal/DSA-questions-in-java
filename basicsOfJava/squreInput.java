package basicsOfJava;
import java.util.Scanner;
public class squreInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        int squre = num*num;
        System.out.println("Squre : "+squre);
        int cube = num*num*num;
        System.out.println("Cube : "+cube);
    }
}
