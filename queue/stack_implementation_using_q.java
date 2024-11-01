package queue;
import java.util.*;
class stack{
    Queue<Integer> q1 = new LinkedList<>();
    int size = 0;
    void push(int ele)
    {
        q1.add(ele);
        size++;
    }
    int peek()
    {
        if(size == 0)
        {
            System.out.println("Empty stack");
            return -1;
        }
        for(int i = 0 ; i < size-1 ; i++)
        {
            q1.add(q1.remove());
        }
        int a = q1.remove();
        q1.add(a);
        return a;
    }
    int pop()
    {
        if(size == 0)
        {
            System.out.println("Empty stack");
            return -1;
        }
        for(int i = 0 ; i < size-1 ; i++)
        {
            q1.add(q1.remove());
        }
        size--;
        return q1.remove();
    }
    boolean isEmpty()
    {
        if(size == 0)return true;
        return false;
    }
}
public class stack_implementation_using_q {
    public static void main(String[] args) {
        stack  st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}
