package methods;

public class passByValue_passByReference {
    static void changeValue(int x)//pass by value
    {
        x = 100;
    }
    public static void main(String[] args) {
        int a = 10 ;
        System.out.println("before changing value"+a);
        changeValue(a);
        System.out.println("after changing value"+a);
        //java does not have pass by reference
    }
}
