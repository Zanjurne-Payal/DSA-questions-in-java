package string;
import java.util.*;
public class java_string_builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hii");
        System.out.println(str);    //print hii
        //str += "hellow";  shows an error
        str.append("hellow");       //print hiihellow
        System.out.println(str);
        //append() = use for add an string to previous one
        //setCharAt() = set character at that index
        str.setCharAt(0,'m');
        System.out.println(str);       //print miihellow

        //insert(idx,ch) = insert at perticular idx
        str.insert(2 , 'n');
        System.out.println(str);

        //deleteCharAt(idx) = delete character at idx
        str.deleteCharAt(3);
        System.out.println(str);

        //reverse() = reverse the string
        str.reverse();
        System.out.println(str);

        //delete(i,j) =     delete from i to j-1 i is includive j is excludive
        str.delete(0,1);
        System.out.println(str);

        //other functions are same as string
    }
}
