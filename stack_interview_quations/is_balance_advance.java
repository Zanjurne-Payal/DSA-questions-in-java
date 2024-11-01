package stack_interview_quations;
import java.util.*;
public class is_balance_advance {
    static boolean is_balanced(String str)
    {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '<')
            {
                st.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')')
            {
                if(st.isEmpty())return false;
                else if(st.peek() == '(')
                {
                    st.pop();
                }
            }
            else if(str.charAt(i) == '>')
            {
                if(st.isEmpty())return false;
                else if(st.peek() == '<')
                {
                    st.pop();
                }
            }
            else if(str.charAt(i) == '}')
            {
                if(st.isEmpty())return false;
                else if(st.peek() == '{')
                {
                    st.pop();
                }
            }
            else if(str.charAt(i) == ']')
            {
                if(st.isEmpty())return false;
                else if(st.peek() == '[')
                {
                    st.pop();
                }
            }
        }
        if(st.isEmpty())return true;
        else return false;
    }
    public static void main(String[] args) {
        String str = "{[}]";
        System.out.println("Is stack is balanced :"+is_balanced(str));
    }
}
