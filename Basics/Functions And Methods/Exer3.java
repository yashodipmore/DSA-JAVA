import java.util.Scanner;

public class Exer3 {
    public static void MultipilcationOfN(int number){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of N :-");
    int n = sc.nextInt();
    for(int i=1;i<=10;i++)
    {
        System.out.println(n + " " + i +" " + i*n);
    }
  }
  public static void main(String args[])
  {
    MultipilcationOfN(23);
  }
}
