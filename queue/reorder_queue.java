// q = 1 2 3 4   5 6 7 8
//ans = 1 5 2 6 3 7 4 8

package queue;
import java.util.*;
public class reorder_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int size = q.size();
        //q = 1 2 3 4 5 6 7 8
        for(int i = 0 ; i < size/2; i++)
        {
            st.push(q.remove());
        }
        //q = 5 6 7 8
        //st = 1 2 3 4
        for(int i = 0 ; i < size/2 ; i++)
        {
            q.add(st.pop());
        }
        //q = 5 6 7 8 4 3 2 1
        System.out.println(q);
        for(int i = 0 ; i < size/2 ; i++)
        {
            st.push(q.remove());
        }
       //q = 4 3 2 1
        //st = 5 6 7 8
        for(int i = 0 ; i < size/2 ; i++)
        {
            q.add(st.pop());
            q.add(q.remove());
        }
        // q = 8 4 7 3 6 2 5 1
        for(int i = 0 ; i < size ; i++)
        {
            st.push(q.remove());
        }
        for(int i = 0 ; i < size ; i++)
        {
            q.add(st.pop());
        }
        //q = 1 5 2 6 3 7 4 8
        System.out.println(q);
    }
}
