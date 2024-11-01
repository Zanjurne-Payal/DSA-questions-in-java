//a=97
//z=122
package leetcode;
import java.util.*;
public class contest_421 {
    static public int lengthAfterTransformations(String s, int t) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder(s);
        for(int i = 0 ; i < t ; i++)
        {
            for(int j = 0 ; j < s.length() ; j++)
            {
                int ascii = (int)s.charAt(j);
                if(ascii == 122)
                {
                    s = s+"ab";
                }
                else
                {
                    str.setCharAt(j, (char)((char)ascii+1));
                }
            }
        }
        System.out.println(str.toString());
        return 0;
    }
    public static void main(String[] args) {
        String s = "abcz";
        int t = 2;
        System.out.println(lengthAfterTransformations(s,t));
    }
}
