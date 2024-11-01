package string;
import java.util.*;
public class convert_uppercase_latterse_to_lowercase_vice_versa {
    //String builder
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string ");
//        StringBuilder str = new StringBuilder(sc.nextLine());       //input string builder
//        for(int i = 0 ; i < str.length() ; i++)
//        {
//            boolean flag = true;
//           char ch = str.charAt(i);
//           int asci = (int)ch;
//           if(asci <= 65 && asci > 123) continue;
//           if(asci >= 97 )flag = false;
//           if(flag == true)
//           {
//               asci += 32;
//               char dh = (char)asci;
//               str.setCharAt(i , dh);
//           }
//            else
//           {
//               asci -= 32;
//               char dh = (char)asci;
//               str.setCharAt(i , dh);
//           }
//
//        }
//        System.out.println(str);
//    }


    //Normal String
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            char ch = str.charAt(i);
            int asci = (int) ch;
            if (ch ==' ')continue;
            System.out.println(asci);
            if (asci >= 97) flag = false;
            if(flag) {
                asci += 32;
                ch = (char) asci;
                str = str.substring(0, i) + ch + str.substring(i + 1, n);
            }
            else
                {
                    asci -= 32;
                    ch = (char) asci;
                    str = str.substring(0, i) + ch + str.substring(i + 1, n);
                }
        }
        System.out.println(str);
    }
}
