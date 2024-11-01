package OOPS;

public class Access_modifires {
    public static class demo{
        private int id1 ;
        public int id2;
        protected int id3;
        int id4;    //default
    }
    public static void main(String[] args) {
        // public = use all packages
        //private = same class only
        //default = same package
        demo d = new demo();
        d.id1 = 1;
        d.id2 = 1;
        d.id3 = 1;
        d.id4 = 1;
        System.out.println(d.id1);
        System.out.println(d.id2);
        System.out.println(d.id3);
        System.out.println(d.id4);
    }
}
