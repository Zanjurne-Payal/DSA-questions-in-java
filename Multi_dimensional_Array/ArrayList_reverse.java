package Multi_dimensional_Array;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_reverse {
    //methode 1
    static void reverse(ArrayList<Integer> li){
        int i = 0 , j = li.size()-1;
        while(i < j)
        {
            Integer temp = li.get(i);
            li.set(i , li.get(j));
            li.set(j , temp);

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(15);
        li.add(25);
        li.add(315);
        li.add(45);
        li.add(55);
        System.out.println("Original List :"+li);
        //methode 2
        Collections.reverse(li);
        //reverse(li);
        System.out.println("Reverse List :"+li);

        //sort in ascending order
        Collections.sort(li);
        System.out.println("Array after sorting :"+li);

        // sort in descending order
        Collections.sort(li , Collections.reverseOrder());
        System.out.println("Sorting in descending order :"+li);

        // String ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Hii");
        list.add("Payal");
        list.add("Zanjurne");
        list.add("your");
        list.add("nice!");
        System.out.println("Origional :"+list);
        
        Collections.sort(list);
        System.out.println(" Sorted list :"+list);

        Collections.sort(list , Collections.reverseOrder());
        System.out.println(" Sorted list :"+list);
    }
}
