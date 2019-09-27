import java.io.*;
public class Buffer_Reader
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(read);
        int a,b,c;
        System.out.println("Enter a number: ");
        a=Integer.parseInt(buff.readLine());
        System.out.println("Enter a number: ");
        b=Integer.parseInt(buff.readLine());
        c=a+b;
        System.out.println("Sum is "+c);
    }
}