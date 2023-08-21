public class InstanceVar {
    String name = "Yashodip More";
    int RollNo = 21;
    double CGPA = 7.2900;

    public static void main(String[] args) {
        InstanceVar n = new InstanceVar();
        
        System.out.println("My name is "+n.name);
        System.out.println("My Roll Number is "+n.RollNo);
        System.out.println("My CGPA of first sem is "+n.CGPA);
    }
}
