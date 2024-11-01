package Stack;
import java.util.*;
public class display {
    static void display_stack(Stack<Integer> st)
    {
        int[] arr = new int[st.size()];
        for(int i = st.size()-1 ; i >= 0 ; i--)
        {
            arr[i] = st.pop();
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+"   ");
            st.push(arr[i]);
        }
        System.out.println();
    }
    static void display_recursively(Stack<Integer> st)
    {
        if(st.isEmpty())return;
        int top = st.pop();
        // System.out.print(top+"   ");     // for reverse printing
        display_recursively(st);
        System.out.print(top+"   ");     // for normal printing
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(50);

        System.out.println(st);
        display_stack(st);
        display_recursively(st);
    }
}
