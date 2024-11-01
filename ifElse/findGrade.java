package ifElse;
import java.util.Scanner;
public class findGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your percentage");
        int num = sc.nextInt();
        if(num >90){
            System.out.println("excellent");
        }
        else if(num > 80 ){
            System.out.println("Very Good");
        }
        else if(num > 70){
            System.out.println("Good");
        }
        else if(num > 60){
            System.out.println("Can do better");
        }
        else if(num >50){
            System.out.println("Average");
        }
        else if(num >40){
            System.out.println("Below Average");
        }
        else{
            System.out.println("Fail");
        }
    }
}