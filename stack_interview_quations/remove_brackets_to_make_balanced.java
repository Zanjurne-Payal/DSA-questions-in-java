package stack_interview_quations;
import java.util.*;
public class remove_brackets_to_make_balanced {
    static int remove_to_balance(String str)
    {
        Stack<Character> st = new Stack<>();
        int cnt = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == '(')
            {
                st.push(str.charAt(i));
                cnt++;
            }
            else
            {
                if(st.isEmpty())
                {
                    cnt++;
                }
                if(st.peek() == '(')
                {
                    st.pop();
                    cnt--;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String str = "((()))(";
        System.out.println(remove_to_balance( str));
    }
}
