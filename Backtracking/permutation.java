package Backtracking;
import java.util.*;
public class permutation {
    static void print_permutations(String str , String  s)
    {
        if(str.isEmpty())
        {
            System.out.print(s+"  ");
        }
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            String left = str.substring(0 , i);
            String right = str.substring(i+1 );
            String rem = left+right;
            print_permutations(rem , s+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        print_permutations(str,"");
    }
}
