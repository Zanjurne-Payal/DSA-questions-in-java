package recursion;
import java.util.Scanner;
public class p_to_the_power_q {
    static int power(int n , int p){
        if(p == 0){
            return 1;
        }
//        return n*power(n , p-1);  high complaxity
        int pow = power(n , p/2);
        if(p % 2 == 0) return pow*pow;
        else return n*pow*pow;//else part
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the power :");
        int p = sc.nextInt();
        System.out.println(power(n,p));
    }
}
