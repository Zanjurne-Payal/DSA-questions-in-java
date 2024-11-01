package loops;
import java.util.Scanner;
public class no_of_digits_inNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int i = 0;
        do{
            num = num/10;
            i++;
        }while(num != 0);
        System.out.println("Number of digit : "+i);
    }
}
