package HashMap;
import java.util.*;
public class anagram_ {
    static boolean freq(String str,String str2)
    {
        if(str.length() != str2.length()) return false;
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < str2.length() ; i++)
        {
            if(!map.containsKey(str2.charAt(i)))map.put(str2.charAt(i),1);
            else map.put(str2.charAt(i),map.get(str2.charAt(i))+1);
        }
        for(int i = 0 ; i < str.length(); i++)
        {
            if(!map.containsKey(str.charAt(i)))return false;
            int curr = map.get(str.charAt(i));
            map.put(str.charAt(i),curr-1);
        }
        for(Integer i : map.values())
        {
            if(i != 0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "knee";
        String str2 = "Keen";
        System.out.println(freq(str1,str2));
    }
}
