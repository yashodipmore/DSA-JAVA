package Loops;
class Solution 
{
    public static void main(String args[])
    {
        int n = 1122;

        while( n > 0)
        {
            int lastd = n%10;
            System.out.print(lastd );
            n = n/10;
        }

    }
}