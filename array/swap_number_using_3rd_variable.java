package array;
import java.util.Scanner;
public class swap_number_using_3rd_variable {
    static void Swap(int a , int b){
        System.out.println("Original value of a :"+a);
        System.out.println("Original value of b :"+b);
        int c = a ;
        a = b ;
        b = c ;
        System.out.println("After Swapping  value of a :"+a);
        System.out.println("After Swapping value of b :"+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 10 ;
        int y = 20 ;
        Swap(x , y);
    }
}
