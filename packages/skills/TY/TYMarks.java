package packages.skills.TY;
import packages.skills.SY.SYMarks;
public class TYMarks {
    public int theory;
    public int practicals;
    public TYMarks(int theory , int practical)
    {
        this.theory = theory;
        this.practicals = practical;
    }
    public int getComputerTotal()
    {
        return theory+practicals;
    }

    public static void main(String[] args) {
        System.out.println("HII");
    }
}
