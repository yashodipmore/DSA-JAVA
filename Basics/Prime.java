package Loops;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2)
        {
            System.out.println("n is Prime Number");
        } 
        else
        {
            boolean isPrime = true;
            for(int i=2 ; i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isPrime = false;
                }
                
            }
            if(isPrime==true)
                {
                    System.out.println("n is Prime");
                }
                else{
                    System.out.println("n is not prime number");
                }
        }
    }
}