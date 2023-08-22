public class Instance1 {

    int length;
    int witdth;

    int calculatearea()
    {
        return length*witdth;
    }
    public static void main(String[] args) {
        
        Instance1 I = new Instance1();
        I.length = 23;
        I.witdth = 12;

        int area = I.calculatearea();
        System.out.println("Area of Rectangle is "+area);
    }
}
