package OOPS;

public class class_in_different_file2 {
    public static void main(String[] args) {
        class_in_different_file1 obj = new class_in_different_file1();
        obj.name = "abc";
        obj.Address = "Karjat";
        System.out.println(obj.name);
        System.out.println(obj.Address);
    }
}
