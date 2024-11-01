package string;
import java.util.*;
public class equals {
    public static void main(String[] args) {
        String str = "Hii";
        String str2 = "Hii";
        String str3 = new String("Hii");
        System.out.println(str == str2);    //true both are pointing same address
        System.out.println(str == str3);    //false both are not pointing same address

            // == method check according to address

        System.out.println(str.equals(str2));   //true
        System.out.println(str.equals(str3));   //true
    }
}
