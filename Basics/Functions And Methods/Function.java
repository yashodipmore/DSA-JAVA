import java.util.Scanner;

public class Function {
    public static int Mutilply(int a, int b)
    {
        int product = a*b;
        System.out.println(product);
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Mutilply(x, y);
    }
}
