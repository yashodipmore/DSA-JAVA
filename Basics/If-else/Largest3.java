public class Largest3 {
    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        int c = 70;
        if ((a >= b) && (a >= c))
        {
            System.out.println("a is largest");
        }
        else if (b >= c)
        {
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");
        }
    }
}
