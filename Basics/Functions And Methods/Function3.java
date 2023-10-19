public class Function3 {

    public static void Swap(int x, int y)
    {
        int temp = x;
        x = y;
        y = temp;
        return;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Swap(a,b);
        System.out.println("x = "+a);
        System.out.println("y = "+b);
        

        
    }
}
