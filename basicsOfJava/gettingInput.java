package basicsOfJava;
import java.util.Scanner; //must for accepting input
public class gettingInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int roll;
        System.out.println("Enter roll number");
        roll=sc.nextInt();
        char name;
        System.out.println("Enter your name");
        name= (char) sc.nextInt();
    }
}
