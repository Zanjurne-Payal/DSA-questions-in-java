package Stack;
import java.util.*;
public class insertion {
    static Stack<Integer> insert_at_idx(int idx , int ele ,Stack<Integer> st)
    {
        Stack<Integer> s = new Stack<>();
        while(st.size() > idx)
        {
            s.push(st.pop());
        }
        st.push(ele);
        while(!s.isEmpty())
        {
            st.push(s.pop());
        }
        return st;
    }
    static void push_at_bottom(Stack<Integer> st , int ele)
    {
        if(st.isEmpty())
        {
            st.push(ele);
            return;
        }
        int top = st.pop();
        push_at_bottom(st , ele);
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        st = insert_at_idx(1 , 100 , st);
        System.out.println(st);
        push_at_bottom(st , 90);
        System.out.println(st);
    }
}
