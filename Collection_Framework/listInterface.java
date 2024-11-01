package Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class listInterface {
    static void arrayListEX()
    {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l);
        System.out.println(l.get(1));   //get element at idx 1
        l.set(1,200); // set 200 value at 1 idx
        System.out.println(l);
        System.out.println(l.contains(10));     // return true if value is present

    }
    static void linkedListEX()
    {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l);
        System.out.println(l.get(1));   //get element at idx 1
        l.set(1,200); // set 200 value at 1 idx
        System.out.println(l);
        System.out.println(l.contains(10));     // return true if value is present

    }
    static void stack()
    {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.get(1));
        System.out.println(st.getFirst());
        System.out.println(st.pop());
        System.out.println(st.empty());
        System.out.println(st.size());
    }
    public static void main(String[] args) {
        //arrayListEX();
        linkedListEX();
        stack();
    }
}
