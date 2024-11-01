package HashMap;
import java.util.*;
public class anagrams {
    public static void main(String[] args) {
        HashMap<Character , Integer> mp = new HashMap<>();
        HashMap<Character , Integer> mp2 = new HashMap<>();
        String str1 = "knee";
        String str2 = "Keen";
        for(char ch = 0 ; ch < str1.length() ; ch++)
        {
            if(!mp.containsKey(str1.charAt(ch)))
            {
                mp.put(str1.charAt(ch),1);
            }
            else
            {
                mp.put(str1.charAt(ch),mp.get(str1.charAt(ch))+1);
            }
        }
        System.out.println(mp);
        for(char ch1 = 0 ; ch1 < str2.length() ; ch1++)
        {
            if(!mp2.containsKey(str2.charAt(ch1)))
            {
                mp2.put(str2.charAt(ch1),1);
            }
            else
            {
                mp2.put(str2.charAt(ch1),mp2.get(str2.charAt(ch1))+1);
            }
        }
        System.out.println(mp2);
        System.out.println(mp2.equals(mp));
    }

}
