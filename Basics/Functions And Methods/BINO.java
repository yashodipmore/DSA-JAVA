public class BINO
{ 

    public static int factorial(int n)
    {
        int f = 1;
        for (int i = 1; i <= n;i++)
        {
            f = f*i;
        }
        return f;
    }
    public static int binoC(int n,int r)
    {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binoC = fact_n / (fact_r * fact_nmr);
        return binoC;
    }
    public static void main(String args[])
    {
    System.out.println(binoC(5, 2));

    }
}