package recursion;
import java.util.Scanner;
public class reverse_string {
    static void reverse(String str , int idx){
        if(idx == str.length())return;
        reverse(str , idx+1);
        System.out.print(str.charAt(idx));
    }
    static String method2(String str , int idx){
        if(idx == str.length()) return "";
        String ans = method2(str ,idx+1);
        return ans+str.charAt(idx);
    }
    static String method3(String str){
        if(str.isEmpty()) return str;
        String ans = method3(str.substring(1));
        return ans+str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        reverse(str , 0);
        System.out.println("\n"+method2(str , 0));
        System.out.println(method3(str));
    }
}
