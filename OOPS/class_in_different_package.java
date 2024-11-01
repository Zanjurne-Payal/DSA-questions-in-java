package OOPS;
import loops.find_factorial;
public class class_in_different_package {
    public static void main(String[] args) {
        find_factorial a = new find_factorial();
//        a.i = 9;    // compalsory to declare as public in other package class to access it
        System.out.println(a.i);
        //if we do not initialize the value then it print default value
    }
}
