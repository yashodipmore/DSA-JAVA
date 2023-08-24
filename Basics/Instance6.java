public class Instance6 {
    String name;
    String grade;
    int age;
Instance6( String n, String g, int a)
{
    name = n;
    grade = g;
    age = a;
}
void display()
{
    System.out.println("Name - "+name+" Grade - "+grade+" age - "+age);
}

public static void main(String[] args) {
    Instance6 I1 = new Instance6 ("Yashodip", "A", 19);
    Instance6 I2 = new Instance6 ("Bhumika", "A", 19);
    Instance6 I3 = new Instance6 ("Rutuja", "A", 19);
    Instance6 I4 = new Instance6 ("Anjali", "A", 19);
    Instance6 I5 = new Instance6 ("Arti", "A", 19);

    I1.display();
    I2.display();
    I3.display();
    I4.display();
    I5.display();
}
}
