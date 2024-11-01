package string;
import java.util.*;
public class print_all_words_in_reverse_order_in_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = sc.nextLine();
        String ans = "";
        StringBuilder s = new StringBuilder("");
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch != ' ')
            {
                s.append(ch);
            }
            else
            {
                s.reverse();
                ans += s;
                ans += " ";
                s = new StringBuilder("");
            }
        }
        ans += s.reverse();
        System.out.println(ans);
    }
}
