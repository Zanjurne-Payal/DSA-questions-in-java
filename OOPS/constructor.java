package OOPS;
//constructor name should be same as class name and it does not have return type
public class constructor {
    public static class student{
        String name;
        int id;
        double percent;
       student(String name , int rno , int percentage){       //contructor
           this.name = name;
           this.id = rno;
           this.percent = percentage;
       }
    }
    public static void main(String[] args) {
        student s = new student("payal",62,99);
        System.out.println(s.name +"    "+s.id +"    "+s.percent +"    ");
    }
}
