package loops;
import java.util.Scanner;
public class print_1to50_expect_multipleOf3_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1 ; i <= 50 ; i++)
        {
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
