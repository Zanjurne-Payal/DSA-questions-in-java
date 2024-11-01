package queue;
import java.util.*;
public class print_all_elements_in_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        Queue<Integer> q2 = new LinkedList<>();
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q2.add(q.remove());
        }
        while(!q2.isEmpty())
        {
            q.add(q2.remove());
        }
    }
}