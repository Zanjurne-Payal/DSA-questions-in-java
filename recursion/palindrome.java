package recursion;
import  java.util.Scanner;
public class palindrome {
    static String reverse(String str){
        if(str.isEmpty()) return str;
        String ans = reverse(str.substring(1));
        return ans+str.charAt(0);
    }
    static boolean check(String str , int start , int end){
        if(start >= end )return true;
        if(str.charAt(start) == str.charAt(end) && check(str , start+1 , end-1)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String rev = reverse(str);
        if(str.equals(rev))
        {
            System.out.printf("%s is Palindrome string",str);
        }
        else {
            System.out.printf("%s is Not palindrome",str);
        }

        System.out.println("\n"+check(str , 0 , str.length()-1));
    }
}
