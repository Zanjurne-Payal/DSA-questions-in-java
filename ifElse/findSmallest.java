package ifElse;
import java.util.Scanner;
public class findSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int payal , shubham , akshay , sudhir;
        System.out.println("Enter payal`s age");
        payal = sc.nextInt();
        System.out.println("Enter shubham`s age");
        shubham = sc.nextInt();
        System.out.println("Enter akshay`s age");
        akshay = sc.nextInt();
        System.out.println("Enter sudhir`s age");
        sudhir = sc.nextInt();
//        if(payal <= shubham && payal <= akshay && payal <= sudhir )
//        {
//            System.out.println("payal is youngest child");
//        }
//        else if(shubham <= payal && shubham <= akshay && shubham <= sudhir )
//        {
//            System.out.println("shubham is youngest child");
//        }
//        else if(akshay <= shubham && akshay <= payal && akshay <= sudhir )
//        {
//            System.out.println("akshay is youngest child");
//        }
//        else{
//            System.out.println("sudhir is youngest child");
//        }
        // best way to solve using nested if else
        if(payal <= shubham)
        {
            if(payal <= akshay)
            {
                if(payal <= sudhir)
                {
                    System.out.println("Payal is youngest child");
                }
                else
                {
                    System.out.println("Sudhir is youngest child");
                }
            }
            else
            {
                if(akshay <= sudhir)
                {
                    System.out.println("Akshay is youngest child");
                }
                else
                {
                    System.out.println("Sudhir is youngest child");
                }
            }
        }
        else{
            if(shubham <= akshay)
            {
                if(shubham <= sudhir)
                {
                    System.out.println("shubham is youngest child");
                }
                else
                {
                    System.out.println("sudhir is youngest child");
                }
            }
            else{
                if(akshay <= sudhir)
                {
                    System.out.println("akshay is youngest child");
                }
                else{
                    System.out.println("Sudhir is youngest child");
                }
            }
        }
    }
}
