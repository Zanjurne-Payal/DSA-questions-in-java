package Stack_infix_prefix_postfix;
import java.util.*;
public class prefix_to_infix {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        System.out.println("prefix  "+prefix);
        Stack<String> val = new Stack<>();
        for(int i = prefix.length()-1 ; i >= 0 ; i--)
        {
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57)
            {
                val.push(""+ch);
            }
            else
            {
                String v1 = val.pop();
                String v2 = val.pop();
                val.push("("+v1+ch+v2+")");
            }
        }
        System.out.println("infix  "+val.peek());
    }
}
