package HashMap;
import java.util.*;
public class Hashset {
    public static void main(String[] args) {
     HashSet<Integer> set = new HashSet<>();set.add(10);
        set.add(10);
        set.add(100);
        set.add(190);
        set.add(10);
        System.out.println(set);
        System.out.println(set.contains(100));
        System.out.println(set.size());
        for(Integer i : set)
        {
            System.out.println(i);
        }
    }
}
