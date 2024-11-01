package packages.skills;
import packages.skills.SY.SYMarks;
import packages.skills.TY.TYMarks;
public class student {
    private int rno;
    private String name;
    private SYMarks syMarks;
    private TYMarks tyMarks;
    student(int a , String b , SYMarks c , TYMarks d)
    {
        this.rno = a;
        this.name = b;
        this.syMarks = c;
        this.tyMarks = d;
    }
    public int getMarks()
    {
        return syMarks.getComputerTotal()+ tyMarks.getComputerTotal();
    }
    public String calculate_grade()
    {
        int total = getMarks();
        if(total >= 70)return "A";
        else if(total >= 50)return "B";
        else if(total >= 40)return "C";
        else return "fail";
    }
    public void display_result()
    {
        System.out.println("roll no "+rno);
        System.out.println("Name "+name);
        System.out.println("total "+getMarks());
        System.out.println("Grade "+calculate_grade());
    }

    public static void main(String[] args) {
        SYMarks s1 =  new SYMarks(25,36,20);
        TYMarks t1 = new TYMarks(40,65);
        student s = new student(37 , "Payal Zanjurne", s1 , t1);
        s.display_result();
    }
}

