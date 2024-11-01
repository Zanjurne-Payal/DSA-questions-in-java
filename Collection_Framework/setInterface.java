package Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//set = collection which does not having duplicate elements
public class setInterface {
    static void HashSetEX()
    {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(10);
        System.out.println(hs);
    }
    static void LinkedHashSetEX()
    {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(10);
        System.out.println(hs);
    }
    static void TreeSetEX()
    {
        TreeSet<Integer> hs = new TreeSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(10);
        System.out.println(hs);
    }
    public static void main(String[] args) {
      TreeSetEX();
    }
}
