package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<>();
        mp.put(1,"Payal");
        mp.put(2,"Shubham");
        mp.put(3,"Akshay");
        mp.put(4,"Sudhir");
        System.out.println(mp);
        mp.put(1,"Zanjurne");//update the value to payal to Zanjurne
        System.out.println(mp);
    }
}
