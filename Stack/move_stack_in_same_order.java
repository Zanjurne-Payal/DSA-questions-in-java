package Stack;
import java.util.*;
public class move_stack_in_same_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the number of stack elements");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements");
        for(int i = 0 ; i < n ; i++)
        {
            st.push(sc.nextInt());
        }
        System.out.println(st);
        // reverse order
        Stack<Integer> rt = new Stack<>();
        while(!st.isEmpty())
        {
//            rt.push(st.peek());
//            st.pop();
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> ct = new Stack<>();
        while(!rt.isEmpty())
        {
            ct.push(rt.pop());
        }
        System.out.println(ct);
    }
}
