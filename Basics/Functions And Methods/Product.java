public class Product {
    public static int Multiply(int a,int b)
    {
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int Prod = Multiply(3, 5); 
        System.out.println(Prod);
        Prod = Multiply(30, 40);
        System.out.println(Prod);
    }
}
 