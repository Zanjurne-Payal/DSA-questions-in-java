package packages.skills.SY;

public class SYMarks {
    public int ComputerTotal;
    public int MathTotal;
    public int ElectronicTotal;
    public SYMarks(int a , int b , int c)
    {
        this.ComputerTotal = a;
        this.MathTotal = c;
        this.ElectronicTotal = c;
    }
    public int getComputerTotal()
    {
        return ComputerTotal;
    }
}
