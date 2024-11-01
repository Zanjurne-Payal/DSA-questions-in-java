package OOPS;

//creating multiple classes insight the main function is not good way of storing data because its scope is limited
// do not use public static when we create class inside the main()
public class class_within_main_function {
//    public static void display(String name){
//        System.out.println(name);
//    }

    //it show an error because scope of class is limited
//public static void display(Student s1){
//        System.out.println(s1.id);
//    }

    public static void main(String[] args) {
//        String name = "Payal";
//        display(name);
        class Student{
            int id;
            String name ;
        }
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "abc";
        System.out.println(s1.id+"  "+s1.name);
    }
}
