package Core_Java;
import java.util.*;
public class exception_handling {
    static void check(int a , int b)
    {
        if(a == 0 || b == 0) {
            throw new ArithmeticException("Not devide to zero");
        }
        else
        {
            System.out.println(a/b);
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        check( a , b );
    }
}
