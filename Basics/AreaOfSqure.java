import java.util.Scanner;

public class AreaOfSqure {
public static void main(String[] args) {
    Scanner yc = new Scanner (System.in);
    System.out.println("Enter Side of Square");
    int S = yc.nextInt();
    int Area = S*S;
    System.out.println("Area of "+S+" is "+Area);
}
}
