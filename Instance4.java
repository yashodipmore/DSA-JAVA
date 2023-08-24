public class Instance4 {
    String model;
    int  year;

    Instance4(String m , int y)
    {
        model = m;
        year = y;
    }
    void display()
    {
       System.out.println("model "+model+"year "+year);
    }

    public static void main(String[] args) {
        Instance4 I1 = new Instance4("BMW",2028);
        Instance4 I2 = new Instance4("Rolls Royes",2027);

        I1.display();
        I2.display();
    }
}
