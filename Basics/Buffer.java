import java.io.*;
class Buffer
{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the the String :- ");
        String str = br.readLine();
        System.out.println("Enter the String is "+str);
    }
}