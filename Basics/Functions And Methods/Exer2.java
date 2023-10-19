import java.util.Scanner;

public class Exer2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int evenSum=0;
        int oddSum=0;

        do{
            System.out.println("Enter the Integer :-");
            num = sc.nextInt();
            if (num%2==0) {
                evenSum +=num;
            } else {
                oddSum +=num;
            }
            System.out.println("If you want to continued then press 1 for YES, and 0 for NO");
            choice = sc.nextInt();

        }while(choice==1);
        System.out.println("Sum of Even Integers - "+evenSum);
        System.out.println("Sum of Odd Inetegers - "+oddSum);
    }
}
