package stack_interview_quations;
import java.util.*;

// basic method

//public class Min_Stack {
//    Stack<Integer> st = new Stack<>();
//    Stack<Integer> min = new Stack<>();
//    public void push(int data)
//    {
//        if(st.isEmpty())
//        {
//            st.push(data);
//            min.push(data);
//        }
//        else
//        {
//            if(min.peek() < data) min.push(min.peek());
//            else min.push(data);
//        }
//    }
//    public void pop()
//    {
//        st.pop();
//        min.pop();
//    }
//    public int peek()
//    {
//      return st.peek();
//    }
//    public int getMin()
//    {
//        return min.peek();
//    }
//    public static void main(String[] args) {
//        Min_Stack st = new Min_Stack();
//       // st.push(1);
//        st.push(10);
//        st.push(3);
//        st.push(7);
//        st.push(2);
//        st.push(9);
//        System.out.println(st.getMin());
//    }
//}

//best space complexity

public class Min_Stack {
    Stack<Integer> st = new Stack<>();
    int min = 0;
    public void push(int data)
    {
        if(st.isEmpty())
        {
            st.push(data);
            min = data;
        }
        if(data >= min) st.push(data);

       if(data < min)
        {
          //st.push(data - min); for positive values only
            st.push(2*data-min);
          min = data;
        }
    }
    public void pop()
    {
        if(st.isEmpty()) return;
        if(st.peek() >= min) st.pop();
        if(st.peek() < min)
        {
            min = 2*min - st.peek();
            st.pop();
        }
    }
    public int peek()
    {
        if(st.isEmpty()) return -1;
        if(st.peek() >= min) return st.peek();
        if(st.peek() < min) return min;
        return 0;
    }
    public int getMin()
    {
        if(st.isEmpty()) return -1;
        return min;
    }
    public static void main(String[] args) {
        Min_Stack st = new Min_Stack();
        // st.push(1);
        st.push(10);
        st.push(3);
        st.push(7);
        st.push(2);
        st.push(9);
        System.out.println(st.getMin());
    }
}

