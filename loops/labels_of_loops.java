package loops;
import java.util.Scanner;
public class labels_of_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loop:for(int i = 1; i<5;i++)
        {
            System.out.println(i);
            break loop;
        }
    }
}
