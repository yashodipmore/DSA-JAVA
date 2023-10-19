public class Add {
    //function to calculate sum of 2 numbers
    public static int SUM(int a,int b)
    {
        return a+b;
    }
    //function to  calculate three numbbers
    public static int SUM(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        System.out.println(SUM(5, 10));
        System.out.println(SUM(5, 15, 15));
    }
}
