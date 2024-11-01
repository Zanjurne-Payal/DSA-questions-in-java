package recursion;
import java.util.Scanner;
public class fibonacci_series {
    static int fibonacci(int n){
        //base case
        if(n == 0 || n == 1){
            return n;
        }
        //sub problem(recursive work)
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series :");
        for(int i = 0 ; i <= n ; i++)
        {
            System.out.print(fibonacci(i)+"  ");
        }
    }
}
