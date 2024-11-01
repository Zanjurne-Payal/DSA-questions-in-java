package string;
import java.util.*;
public class find_palindrome_substrings_in_String {
    public static boolean check(String s)
    {
        int i = 0;
        int j = s.length()-1;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j = i+1 ; j <= str.length() ; j++)
            {
                if(check(str.substring(i,j)))
                {
                    System.out.println(str.substring(i,j));
                    count++;
                }
            }
        }
        System.out.println("Total palindromes in string are "+count);
    }
}
