package loops;
import java.util.Scanner;
public class print_1stMultipleOf_5_alsoMultipleOf_7_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; true ; i++) //we can also use true as condition
        {
            if(i % 5 == 0  &&  i % 7 ==0){
                System.out.println("Found answer = "+i);
                break;
            }
        }
    }
}
