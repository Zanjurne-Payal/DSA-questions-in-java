package OOPS;

public class fraction {
    public static fractions add(fractions f1 , fractions f2)
    {
//        int num = (f1.num*f2.den)+(f2.num*f1.den);
//        int den = f1.den*f2.den;
//        fractions f3 = new fractions(num,den);
//        return f3;
        f1.num = (f1.num*f2.den)+(f2.num*f1.den);
        f1.den = f1.den*f2.den;
        return f1;
    }
    public static fractions mul(fractions f1 , fractions f2)
    {
        int num = f1.num*f2.num;
        int den = f1.den*f2.den;
        fractions f3 = new fractions(num,den);
        return f3;
    }

    public static int gcd(int num , int den){
        int min = Math.min(num , den);
        for(int i = min ; i >= 1 ; i--)
        {
            if(num % i == 0 && den % i == 0)
            {
                return i;
            }
        }
        return 1;
    }
    public static class fractions{
        int num;
        int den;
        fractions(int num , int den){
            this.num = num;
            this.den = den;
            simplify();
        }
        public void simplify(){
           int hcf = gcd(num,den);
           num /= hcf;
           den /= hcf;
        }
    }

    public static void main(String[] args) {
        fractions f1 = new fractions(35,21);
        fractions f2 = new fractions(27,3);
        fractions f3 = add(f1,f2);
        fractions f4 = mul(f1,f2);
        System.out.println("1st fraction  "+f1.num +"/"+f1.den);
        System.out.println("2nd fraction  "+f2.num +"/"+f2.den);
        System.out.println("addition  "+f3.num +"/"+f3.den);
        System.out.println("multiplication  "+f4.num +"/"+f4.den);
    }
}
