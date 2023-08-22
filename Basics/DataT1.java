import java.util.Scanner;

class DataT1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Integer :- ");
        int n = sc.nextInt();
        int factorial = 1,i;

        for(i=1;i <= n;i++)
        {
            factorial *=i;
        }
        System.out.println("Factorial "+factorial);

    }
}