public class Static {
    public static int a,b;

    Static(int x,int y)
    {
        a = x;
        b = y;
    }
    void display()
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Static st = new Static(345,567);
        st.display();
    }
}
