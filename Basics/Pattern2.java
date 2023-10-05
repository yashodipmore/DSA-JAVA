import java.util.*;
class Pattern2
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int l=1;l<=n;l++)
        {
            for(int s=1;s<=n-l+1;s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}