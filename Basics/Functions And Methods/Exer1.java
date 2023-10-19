import java.util.Scanner;

class Exer1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.println("Enter the integer :-");
        num = sc.nextInt();
        for(int i = 1;i<=num;i++)
        {
            fact *=i;
        }
        System.out.println(fact);
    }
}