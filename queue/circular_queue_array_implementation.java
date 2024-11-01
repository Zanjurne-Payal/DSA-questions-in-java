package queue;
import java.util.*;
public class circular_queue_array_implementation {
    public static class Queue
    {
        int f = -1 ;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];
        void add(int data) throws Exception {
            if(size == arr.length)
            {
                throw new Exception("queue is full");
            }
            else if(size == 0)
            {
                f = r = 0;
                arr[0] = data;
            }
            else if(r < arr.length -1)
            {
                arr[++r] = data;
            }
            else if(r  == arr.length -1)
            {
                r = 0;
                arr[0] = data;
            }
            size++;
        }
        int remove()throws Exception
        {
            if(size == 0)
            {
                throw new Exception("queue is empty");
            }
            else {
                int x = arr[f];
                if (f == arr.length - 1) f = 0;
                else f++;
                size--;
                return x;
            }
        }
        boolean isEmpty()
        {
            if(size == 0)return true;
            else return false;
        }
        int peek() throws Exception {
            if (size == 0)
            {
                throw new Exception("Queue is empty");
            }
            else return arr[f];
        }
        void display()
        {
            if(size == 0)
            {
                System.out.println("Queue is empty");
                return;
            }
            else if(f <= r)
            {
                for(int i = f ; i <= r ; i++)
                {
                    System.out.print(arr[i]+"     ");
                }
                System.out.println();
            }
            else
            {
                for(int i = f ; i < arr.length ; i++)
                {
                    System.out.print(arr[i]+"     ");
                }
                for(int i = 0 ; i <= r ; i++)
                {
                    System.out.print(arr[i]+"     ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display(); // 10 20 30 40
        q.remove();
        q.display(); //   20 30 40
        q.add(50);
        q.display(); //   20 30 40 50
        q.add(60);
        q.display(); //  20 30 40 50 60
//        q.add(100);
//        q.display();  // throw exception
        System.out.println("Printing array");
        for(int i = 0 ; i < q.arr.length ; i++)
        {
            System.out.print(q.arr[i]+"   ");
        }
        System.out.println();
    }
}
