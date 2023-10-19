import java.util.Scanner;

public class Function2 {
    public static int Avg(int a,int b,int c)
    {
        int avg = (a+b+c)/3;
        System.out.println(avg);
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        Avg(x,y,z);
    }
}
