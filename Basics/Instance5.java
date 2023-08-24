public class Instance5 {
    String AcHolder;
    double Balance;

    Instance5 (String Ac , double B)
    {
        AcHolder = Ac;
        Balance = B;
    }
    void display()
    {
        System.out.println("Acount Holder - "+AcHolder+" Bank Balance - "+Balance);
    }

    public static void main(String[] args) {
        
        Instance5 I1 = new Instance5(" Yashodip More ",2343646374.456);
        Instance5 I2 = new Instance5(" Yashodeep More ",234827346374.456);

        I1.display();
        I2.display();
    }
}
