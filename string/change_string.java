package string;
import java.util.*;
public class change_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Hello";
        // change 2nd character to y
        s = s.substring(0,2)+'y'+s.substring(3);
        System.out.println(s);
    }
}
