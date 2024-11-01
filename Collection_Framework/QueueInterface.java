package Collection_Framework;

import java.util.*;

public class QueueInterface {
    static void queueEX() {
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
    }

    static void priorityQueueEX() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //by default min priority
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());  // max priority
//        pq.add(-100);
//        pq.add(700);
//        pq.add(50);
//        pq.add(20);
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq);
        pq2.add(-100);
        pq2.add(700);
        pq2.add(50);
        pq2.add(20);
        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);
    }

    static void dequeEX()
    {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.addFirst(200);
        dq.addLast(300);
        dq.add(30);
        dq.add(40);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.pollLast());
    }
    public static void main(String[] args) {
        //queueEX();
       // priorityQueueEX();
        dequeEX();
    }
}
