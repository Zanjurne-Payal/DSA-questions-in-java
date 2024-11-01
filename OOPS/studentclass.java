//objects are real life entities  when object is created memory is initialized
//classes are blueprints  it does not create space on memory


//True false
//1 Oops refer to using objects in programming  = true
//2 class is user defined blueprint through which objects are created = true
//3 objects of same class have different properties/attributes = false
//4 objects are instance of class = true


//Array vs Class
// Array = store multiple elements of similar data type
//class = store multiple attributes of elements

//use first letter capital for class name it is good habit

// scanner is also a class
package OOPS;

public class studentclass {
    //crating new datatype
    public static class Student {
        String name ;
        int roll_no;
        int age ;
        double percentage;
    }
    public static class car{
        String name;
        String type;
        long price;

    }
    public static void display(Student s1)
    {
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.percentage);
    }
    public static void change(Student s1)
    {
        s1.name = "Shubham";
        s1.age = 19;
        s1.percentage = 89.17;
    }
    public static void main(String[] args) {

        //class_name  obj_name = new class_name();

       Student payal = new Student();     //declaration
       payal.name = "Payal zanjurne";    //initialization
       payal.roll_no = 62;              //initialization
       payal.age = 20;                 //initialization
       payal.percentage = 8.34;
       System.out.println("Roll No = "+payal.roll_no);

        System.out.println("before changes");
        display(payal);  //function call
        change(payal);
        System.out.println("after changes");
        display(payal);

       car c1 = new car();
       c1.name = "alto";
       c1.type = "good looking";
       c1.price = 500000;
    }
}
