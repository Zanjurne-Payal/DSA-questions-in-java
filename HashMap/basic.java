package HashMap;
import java.util.*;
public class basic {
    public static void main(String[] args) {
        //Syntax
        Map<Integer,Double> mark = new HashMap<>();
        //adding data
        // keys are unique in hashmap
        mark.put(1,89.90);
        mark.put(2,90.90);
        mark.put(3,45.09);
        mark.put(4,78.45);
        System.out.println(mark);

        //getting value
        System.out.println(mark.get(3));    //45.09
        System.out.println(mark.get(20));   //null

        //changing value
        mark.put(1,88.87);  //change value at 1 key
        System.out.println(mark);
        //put uses = 1 For insertion  2. For updating value

        //remove pair from HashMap
        mark.remove(3);
        System.out.println(mark);   // delete 3
        // remove uses = 1. if exist delete and print value    2.if not exist return null

        //checking key exist in map
        System.out.println(mark.containsKey(2));    //true
        System.out.println(mark.containsKey(3));    //false

        //adding new entry if new key not exist
        mark.putIfAbsent(3,34.55);  //add because 3 not present
        mark.putIfAbsent(4,90.90);  //does not add 4 is already present
        System.out.println(mark);

        //Get all keys in HashMap
        System.out.println(mark.keySet());     //[1,2,3,4]

        //get all values in Hashmap
        System.out.println(mark.values());     //[88.87,90.9,34.55,78.45]

        //get all entries
        System.out.println(mark.entrySet());    //print all key-value pairs

        //Traversing all entries
        //traversing by key
        for(int key : mark.keySet())
        {
            System.out.println("Mark of roll No "+key+"  is : "+mark.get(key));
        }

        //traversing by entrySet
//        for(mark.Entry<Integer , Double> e : mark.entrySet())
//            System.out.printf("mark of %d is %f\n",e.getKey(),e.getValue());

        for(var e : mark.entrySet())
        {
            System.out.printf("%d = %f\n",e.getKey(),e.getValue());
        }
    }
}
