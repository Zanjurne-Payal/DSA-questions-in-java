package loops;
import java.util.Scanner;
public class sum_of_n_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        //while loop
          int i = 1;
          int sum = 0;
//        while(i <= num)
//        {
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);

        //for loop
//        for(int i = 0; i <= num; i++)
//        {
//            sum = sum+i;
//        }
//        System.out.println(sum);
        //do while loop
        do{
            sum = sum + i;
            i++;
        }while(i <= num);
        System.out.println("sum = "+sum);
    }
}
