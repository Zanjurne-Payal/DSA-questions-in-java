package recursion;
import java.util.Scanner;
import java.util.ArrayList;
public class find_subsiquents_of_String {
    static ArrayList<String> find(String str){
        ArrayList<String> ans = new ArrayList<>();
        //base case
        if(str.isEmpty()){
            ans.add("");
            return ans;
        }
        // self work
        char current = str.charAt(0);

        ArrayList<String> sub = find(str.substring(1));
        for(String s : sub)
        {
            ans.add(current+s);
            ans.add(s);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr String");
        String str = sc.nextLine();
        System.out.println(find(str));
    }
}
