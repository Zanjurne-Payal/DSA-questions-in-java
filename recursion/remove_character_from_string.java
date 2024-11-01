package recursion;
import java.util.Scanner;
public class remove_character_from_string {
    static String remove(String str , char ch , int idx){
      if(idx >= str.length())return "";
      String ans = remove(str , ch , idx+1);
      if(str.charAt(idx) != ch) return str.charAt(idx) + ans;
      else return ans;
    }
    static  String method_2(String str){
        if(str.isEmpty()) return "";
        String ans = method_2(str.substring(1));
        if(str.charAt(0) != 'a') return str.charAt(0)+ans;
        else return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        char ch = 'a';
        //System.out.println(remove(str , ch , 0));
        System.out.println(method_2(str));
    }
}
