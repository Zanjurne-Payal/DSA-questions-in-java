package queue;
import java.util.*;
class queue
{
    Stack<Integer> st = new Stack<>();
    Stack<Integer> help = new Stack<>();
    int size = 0;
    void add(int ele)
    {
        st.push(ele);
        size++;
    }
    int peek()
    {
        if(size == 0)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        for(int i = 0 ; i < size-1 ; i++)
        {
            help.push(st.pop());
        }
        int x = st.peek();
        for(int i = 0 ; i < size-1 ; i++)
        {
            st.push(help.pop());
        }
        return x;
    }
    int remove()
    {
        if(size == 0)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        for(int i = 0 ; i < size-1 ; i++)
        {
            help.push(st.pop());
        }
        int x = st.pop();
        for(int i = 0 ; i < size-1 ; i++)
        {
            st.push(help.pop());
        }
        size--;
        return x;
    }
    boolean isEmpty()
    {
        if(size==0)return true;
        return false;
    }
}
public class queue_implementation_using_stack {
    public static void main(String[] args) {
        queue q = new queue();
        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
