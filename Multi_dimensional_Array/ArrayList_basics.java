package Multi_dimensional_Array;
import java.util.ArrayList;
public class ArrayList_basics {
    public static void main(String[] args) {
        //Wrapper class = A class whose object contains or wrap primitive data types (PDT).
        // object of wrapper class contains a field with stores PDT.

        //wrapper classes

        //1. int  = Integer
        //2. float  = Float
        //3. char  = Character
        //4. boolean  = Boolean
        //5. long  = Lng
         Integer j = Integer.valueOf(7);
         //Integer j = 55;   .....also valid
        System.out.println(j);

        //use Array list
        ArrayList<Integer> li = new ArrayList<Integer /*Optional*/>();
        ArrayList<Boolean> b = new ArrayList<>();

        //Add elements
        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);
        li.add(9);
        li.add(10);
        //Get an element index i
        //get(index);
        System.out.println(li.get(1));

        //print with for loop
        for(int i = 0 ; i < li.size() ; i++)
        {
            System.out.println(li.get(i));
        }

        //printing ArrayList Directly
        System.out.println(li);

        //adding Element at same index i

        li.add(1 , 111);
        System.out.println(li);

        //modifying element at index i

        li.set(1 , 10);
        System.out.println(li);

        //Removing element at index i

        li.remove(1);
        System.out.println(li);

        //remove an element without using index

        System.out.println(li.remove(Integer.valueOf(5)));
        System.out.println(li.remove(Integer.valueOf(50000)));
        System.out.println(li);

        //checking the element id exist?

        System.out.println(li.contains(Integer.valueOf(6)));
        System.out.println(li.contains(Integer.valueOf(500)));

        //if you don't specify class , You can put anything inside

        ArrayList arr = new ArrayList();
        arr.add(100);
        arr.add("Payal");
        arr.add('z');
        arr.add(8.36);
        arr.add(true);
        System.out.println(arr);
    }
}
