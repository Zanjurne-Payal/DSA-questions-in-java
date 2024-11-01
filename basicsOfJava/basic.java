package basicsOfJava;

public class basic {
    public static void main(String[] args) {
        System.out.print("payal");//inline space like span tag
        System.out.println("Zanjurne\n");//space is up to full line like div
        System.out.println("from Ramwadi");
        System.out.println("89");
        System.out.println(4);
        System.out.println(4+8);
        System.out.println("4+7");

        //variables = it is containers
        int x=5;
        System.out.println(x);
        x=10;
        System.out.println(x+7);
        x = x + 10;
        System.out.println(x);
        //exercise 1
        int a = 5;
        System.out.println(a);
        a=7;
        System.out.println(a);
        a = a + 6;
        System.out.println(a);
        a = a - 20;
        System.out.println(a);

        //Arithmatic operations
        x = 5;
        int y = 2;
        System.out.println("Addition is "+ x+y);//after string and + all things ARE become string so output is 52
        System.out.println("substraction is "+ (x-y));//brackets have heigher priority so first substraction is done then it convert to string and print so answer is 3
        System.out.println("Multiplication is "+ x*y);
        System.out.println("dividetion is "+ x/y);
        System.out.println("Modules ="+ x%y);

        //increament  decreaent operator
        x=10;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(x);

        //double data type
        double d=3.14;
        System.out.println(d);
        double c=10;
        d=6;
        double z=c/d;
        System.out.println(z);
        z=10/6;//the operands are integer so the operation perform according to int so the answer 1 and then convert into double so 1.0
        System.out.println(z);
        z=10.0/6.0;
        System.out.println(z);
        //5/2 = 2
        //5.0/2 = 2.5
        //5/2.0 = 2.5
        //5.0/2.0 = 2.5

        //variable naming rules

        //name start with alphabet or underscore
        //special characters (except _ ) are not available
        //some particular keywords not allowed
        //comma and blanks are not allowed

    }
}
