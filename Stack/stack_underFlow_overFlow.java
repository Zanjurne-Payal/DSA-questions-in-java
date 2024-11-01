package Stack;
import java.util.*;
public class stack_underFlow_overFlow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st); // 10 20 30
        st.pop();
        System.out.println(st); // 10 20
        st.pop();
        System.out.println(st);// 10
        st.pop();
        System.out.println(st);//
//        st.pop();   //error
//        st.peek(); //error
//        System.out.println(st);

    }
}
// Stack Underflow = if stack is empty and we want to pop or peek push operation is work that time
// Stack OverFlow = if memory is full
//Stack overflow = if we implement stack using array