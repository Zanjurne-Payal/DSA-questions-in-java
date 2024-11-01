package recursion;
import java.util.Scanner;
public class HCF {
    //high complaxity
//    static int hcf(int x , int y){
//        int k = 0;
//        for(int i = 1 ; i < x ; i++)
//        {
//            if(x % i == 0 && y % i == 0)
//            {
//                k = i;
//            }
//        }
//        return k;
//    }
    //  midel level Aproch
//    static int hcf(int x , int y)
//    {
//        while( x % y != 0)
//        {
//            int rem = x % y;
//            x = y;
//            y = rem;
//        }
//        return y;
//    }
    // best approch
    static int hcf(int x , int y){
        if(y == 0)return x;
        return hcf(y , x % y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
        System.out.println("Enter the number : ");
        int y = sc.nextInt();
        System.out.println("HCF = "+hcf(x,y));
        int lcf = (x*y)/hcf(x,y);
        System.out.println("LCF = "+lcf);
    }
}
