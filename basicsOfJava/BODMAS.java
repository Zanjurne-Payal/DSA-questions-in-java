package basicsOfJava;

public class BODMAS {
    public static void main(String[] args) {
    int i = 2 * 3 / 4 + 7 / 4 + 8 - 2 + 5 / 8;// computer work left to right and it work according to priority(BODMAS)
        // * and / have same priority
        // - and + have same priority
        System.out.println(i);
    }
}
