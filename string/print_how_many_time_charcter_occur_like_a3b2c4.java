package string;
import java.util.*;
//input  =  aaaabbbcddee
//output  =  a4b3cd2e2
public class print_how_many_time_charcter_occur_like_a3b2c4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String ans = "" + str.charAt(0);
        int count = 1;
        for(int i = 1 ; i < str.length() ; i++)
        {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev)count++;
            else
            {
                if(count > 1) ans += count;
                count = 1;
                ans += curr;
            }
        }
        if(count > 1)ans += count;
        System.out.println(ans);
    }
}
