package Stack_infix_prefix_postfix;
import java.util.*;
public class postfix_to_prefix {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";       //  -9/*+5346
        System.out.println("postfix  "+postfix);
        Stack<String> val = new Stack<>();
        for (int i = 0; i < postfix.length(); i++)
        {
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57)
            {
                val.push(""+ch);
            }
            else
            {
                String v2 = val.pop();
                String v1 = val.pop();
                val.push(ch+v1+v2);
            }
        }
        System.out.println("Prefix  "+val.peek());
    }
}
