class Instanc3
{
    String name;
    int salary;

    Instanc3(String n, int s)
    {
        salary = s;
        name = n;
    }
         void display()
    {
        System.out.println("Name - "+name+" Salary - "+salary);
    }
    public static void main(String[] args) {
        Instanc3 I1 = new Instanc3("Yashodip" , 264000);
        Instanc3 I2 = new Instanc3("NonCsCoder" , 500000);
        I1.display();
        I2.display();
    }
}