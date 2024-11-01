package Stack;
//import java.util.Stack;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        // int[] arr = new int[5];       array declaration
        // ArrayList<Integer> arr = new ArrayList<>();          Arraylist declaration

        //Stack declaration
        Stack<Integer> s = new Stack<>();

        //push = add element
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s);
        //peek = get element like top in cpp
        System.out.println(s.peek());

        //pop = delete
        s.pop();
        System.out.println(s);

        //size = return size of stack
        System.out.println("Size of stack "+s.size());

        //isEmpty() = check stack is empty or not
        System.out.println("Is stack is empty "+s.isEmpty());
        while(s.size() > 1)
        {
            s.pop();
        }
        System.out.println("First element "+s.peek());
    }
}

//Stack follow LIFO = Last In First Out
