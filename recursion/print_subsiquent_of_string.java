package recursion;
import java.util.Scanner;
public class print_subsiquent_of_string {
    static void print_SSQ(String str , String ans){
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char current = str.charAt(0);
        String rem = str.substring(1);

        print_SSQ(rem , ans+current);
        print_SSQ(rem , ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        print_SSQ(str , "");
    }
}
