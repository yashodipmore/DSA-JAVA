import java.util.Scanner;
class Decision
{
    public static void main(String [] NonCsCoder)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Possitive");
        }
    }
}