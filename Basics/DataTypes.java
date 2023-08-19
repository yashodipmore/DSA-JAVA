public class DataTypes {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'c';
        short s = 512;
        int i = 23;
        float f = 34.2f;
        double d = 3.4565;

        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
    }
}
