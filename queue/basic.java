// fifo
package queue;
import java.util.*;
public class basic {
    public static void main(String[] args) {
       // Queue<Integer> q = new Queue<>();         not use like this
        //Queue<Integer> q = new ArrayDeque<>();    method one
        Queue<Integer> q = new LinkedList<>();     // method 2
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);  // 1 2 3 4 5
        q.remove();
        System.out.println(q);  // 2 3 4 5
        q.poll();   //same as remove
        System.out.println(q);  //  3 4 5

        // get element
        System.out.println(q.element());    // 3
        System.out.println(q.peek()); //3
        System.out.println("size = "+q.size());
        System.out.println(q.isEmpty());
    }
}
