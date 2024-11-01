package string;
import java.util.*;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "Payal Pandurang Zanjurne";    //String s is always capital
//        System.out.println(str);
//
//         get user input for string
//        String s = sc.next();   //next() do not read space so when we want to only one word it work like "payal" but not for "payal zanjurne".
//        String s = sc.nextLine(); // it is used for get multiple lines it read space
//        System.out.println(s);
//
//        String functions
//        length = in array we only use length for getting length
//        for string we have to use length() with round brackets
//        space also calculated in length because it is character
//        String s = "Facebook";
//        System.out.println(s.length());
//
//        //when we have to fetch any single character from string we cant use like array
//        //char ch = str[3]; It is invalid in java cpp allow but java do not
//        //for that we use charAt() function
//
//        System.out.println(s.charAt(1));    // it prints a from facebook
//
//        //indexOf() = it return or print the index at the character we enter
//        //when there is more than time the character is present then it returned its 1st occurance like in apple p is enterd then it returned 1
//
//        System.out.println(s.indexOf('o'));
//
//        //compareTo = if 1st string is grater than second it return positive answer else it returns negative answer
//        // abc.compareTo(pqr) = it return negative answer
//        String a = "abc";
//        String b = "abb";
//        System.out.println(a.compareTo(b)); // it returns positive value
//        System.out.println(a.compareTo("abe")); // it returns negative value
//        //the positive or negative numbers are come according to the difference like   abb and abe comperes answer is -3 because e is 3rd time grater than b
//
//
//        contains() = return true if the characters present in string else return false
//        String str = "College wallah";
//        System.out.println(str.contains("lah")); //true
//        System.out.println(str.contains("hhhh")); //false

//        //startsWith = if we want to check the string starting with that character
//        String str = "College wallah";
//        System.out.println(str.startsWith("Col")); //true
//        System.out.println(str.startsWith("col")); //false

        //endsWith = if we want to check the string ending with that character
//            String str = "College wallah";
//            System.out.println(str.endsWith("wallah")); //true
//            System.out.println(str.endsWith("laah")); //false

        //toLowerCase() = it convert the string to lowercase
//        String str = "Payal Zanjurne";
//        System.out.println(str.toLowerCase());

        //toUpperCase() = it convert the string to uppercase
//        String str = "Payal Zanjurne";
//        System.out.println(str.toUpperCase());

        //concat() = it is used to join two strings for concatination we can use + symbol
//        String str1 = "Payal ";
//        String str2 = "Zanjurne";
//        System.out.println(str1.concat(str2));
//
//
//        // + operator = used to concat two strings
//        System.out.println("abc"+10+20); // abc1012
//        System.out.println("abc"+(10+20)); //abc30

        //substring(i,j) =  i = start and j = end  i is included and j is excluded
//        String str = "abcd"; //0123 indexs
//        System.out.println(str.substring(1,4)); // it print from 1 idx to 3 idx last idx does not print

        //substring(i) = i = start to all string
        String str = "abcd"; //0123 indexs
       System.out.println(str.substring(1)); // it print from i idx to last-1 idx

        //in java same strings point same address
//        String a = "hii";
//        String b = "hii";  //both are pointing to same string address
        //b = "bye";
        //system.out.println(a); //hii
        //system.out.println(b); //bye
        // string does not change

//        //if we want to store the same strings to separate location we use new keyword
//        String s = new String("hii");
//        String s2 = new String("hii"); //that two strings are pointing different addresses


        //immutability of string
        String s = "hii";
        //s.charAt(0) = 'p';    it shows an error it does not change the value

    }
}
