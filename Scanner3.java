import java.util.Scanner;
public class Scanner3 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
       String s = sc.next();
       int i = sc.nextInt();
       float f = sc.nextFloat();
       double d = sc.nextDouble();
       boolean b = sc.nextBoolean();

       System.out.println(s);
       System.out.println(i);
       System.out.println(f);
       System.out.println(d);
       System.out.println(b);
    }
}
