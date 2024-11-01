package string;
import java.util.Scanner;
public class print_all_substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j = i+1; j <= str.length() ; j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
