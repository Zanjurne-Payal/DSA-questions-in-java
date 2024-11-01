package basicsOfJava;
import java.util.Scanner;
public class charDatatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // char ch ='p';  characters should be in single quote.
       // char chv = '@'; special characters are allowed.
        // char ch = '1'; 0 to 9 numbers are also a character.
        //each character has ascii value. a=97 and A=65.
        char ch ='A';
        int c = (int)ch; //we can also write c = ch; it does not give error
        System.out.println(ch);
        System.out.println(c);
    }
}
