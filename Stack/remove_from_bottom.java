package Stack;
import java.util.*;
public class remove_from_bottom {
    static void removeBottom(Stack<Integer> st)
    {
        Stack<Integer> s = new Stack<>();
        while(! st.isEmpty())
        {
            if(st.size() == 1)
            {
                st.pop();
            }
            else {
                s.push(st.pop());
            }
        }
        while(!s.isEmpty())
        {
            st.push(s.pop());
        }
    }
    static void remove_at_idx(Stack<Integer> st , int idx)
    {
        Stack<Integer> s = new Stack<>();
        while(st.size() > idx)
        {
            s.push(st.pop());
        }
        st.pop();
        while(!s.isEmpty())
        {
            st.push(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        removeBottom(st);
        System.out.println(st);
        remove_at_idx(st , 2);
        System.out.println(st);
    }
}
