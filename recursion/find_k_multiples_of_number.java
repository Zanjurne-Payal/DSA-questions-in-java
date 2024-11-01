package recursion;
import java.util.Scanner;
public class find_k_multiples_of_number {
    // MY logic
//    static int multi(int n , int k){
//        if(k == 1)return n;
//        return n+multi(n,k-1);
//    }
    //my  2nd logic
    static void multi(int n , int k){
        if(k == 0)return;
       // if(k == 1){
           // System.out.println(n);
           // return;
       // }
        multi(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the number of multiples :");
        int k = sc.nextInt();
//        for(int i = 1 ; i < k ; i++)
//        {
//            System.out.println(multi(n,i));
//        }
        multi(n,k);
    }
}
