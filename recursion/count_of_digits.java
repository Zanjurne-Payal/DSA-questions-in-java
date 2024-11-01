package recursion;
import java.util.Scanner;
public class count_of_digits {
    static int count(long n){
        if(n >= 0 && n <= 9)
        {
            return 1;
        }
        return count(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long n = sc.nextLong();
        System.out.println(count(n));
    }
}
