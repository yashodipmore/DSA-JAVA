public class Instance2 {
    String RAM;
    String Processor;
    String SSD;

    Instance2(String r, String p, String s)
    {
        RAM = r;
        Processor = p;
        SSD = s;
    }
    void display()
    {
       System.out.println("RAM - "+RAM+"Processor - "+Processor+" SSD - "+SSD);
    }

    public static void main(String[] args) {
        Instance2 I1 = new Instance2("8 GB","Inel Core i3","512 GB");

        I1.display();
    }
}
