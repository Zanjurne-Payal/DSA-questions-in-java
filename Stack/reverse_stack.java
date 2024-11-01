package Stack;
import java.util.*;
public class reverse_stack {
    static void reverse(Stack<Integer> st)
    {
        //original st = 1 2 3 4
        Stack<Integer> rt = new Stack<>();
        while(!st.isEmpty())
        {
            rt.push(st.pop());
        }
        // now rt = 4 3 2 1
        Stack<Integer> s = new Stack<>();
        while(!rt.isEmpty())
        {
            s.push(rt.pop());
        }
        // s = 1 2 3 4
        while(!s.isEmpty())
        {
            st.push(s.pop());
        }
    }
    static void reverse_rec(Stack<Integer> st)
    {
        if(st.isEmpty())return;
        int top = st.pop();
        reverse_rec(st);
        push_bottom(st , top);
    }
    static void push_bottom(Stack<Integer> st , int ele)
    {
        Stack<Integer> s = new Stack<>();
        while(!st.isEmpty())
        {
            s.push(st.pop());
        }
        st.push(ele);
        while(!s.isEmpty())
        {
            st.push(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        System.out.println("After reverse");
        reverse(st);
        System.out.println(st);
        reverse_rec(st);
        System.out.println(st);
    }
}
