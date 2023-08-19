import java.util.Scanner;

public class GST {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Value of Eraser -");
         int Eraser = sc.nextInt();
         System.out.println("Enter the value of Pencil -");
         int Pencil = sc.nextInt();
         System.out.println("Enter the value of Pen -");
         int Pen = sc.nextInt();
         float Total = Eraser+Pencil+Pen;
         System.out.println("Total ="+Total);

         float newTotal = Total + (0.18f * Total);
         System.out.println("After adding GST , Total is "+newTotal);
    }
}
