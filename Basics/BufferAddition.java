import java.io.*;
public class BufferAddition {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int Result = a+b;
        System.out.println("Additon is "+Result);
    }
}
