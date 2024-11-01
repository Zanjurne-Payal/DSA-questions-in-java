package string;
import java.util.*;
public class string_performance {
    public static void main(String[] args) {
        String str = "";
        for(int i = 1 ; i <= 10 ; i++)
        {
            str = str+i; // it is not add in same array it crate new string at every action perform
            // That's why strings performance is week
        }
        System.out.println(str);
    }
}
