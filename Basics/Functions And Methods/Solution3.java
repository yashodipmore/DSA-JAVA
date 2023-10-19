import java.util.*;
public class Solution3 {
    public static void Swap(int a,int b)
    {
        int temp = a;
        a =b;
        b = temp;
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Swap(a,b);
        System.out.println("After swapping Value \n"+a);
        System.out.println(b);
    }
}

