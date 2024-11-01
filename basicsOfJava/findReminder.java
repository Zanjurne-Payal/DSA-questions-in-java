package basicsOfJava;
import java.util.Scanner;
public class findReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter two numbers for find reminder 1st num must be grater");
        a = sc.nextInt();
        b = sc.nextInt();
        int rem = a - b * (a/b);
        //int rem = a%b;
        System.out.println("reminder : "+rem);
        //if the first number is smaller then second then reminder is first number
        int k = 2%5;
        System.out.println(k);
    }
}
