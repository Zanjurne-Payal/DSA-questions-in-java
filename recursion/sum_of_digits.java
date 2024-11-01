package recursion;
import java.util.Scanner;
public class sum_of_digits {
    static int sum(int n){
        if(n >=0 && n <= 9) return n;
        return n%10+sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
