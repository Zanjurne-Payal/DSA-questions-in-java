package HashMap;
import java.util.*;
public class store_personName_age {
    public static void main(String[] args) {
        Map<String,Integer> p = new HashMap<>();
        p.put("Payal",20);
        p.put("Shubham",19);
        p.put("Akshay",27);
        p.put("Sudhir",25);

        for(String key : p.keySet())
        {
            System.out.printf("the age of %s is %d\n",key,p.get(key));
        }
    }
}
