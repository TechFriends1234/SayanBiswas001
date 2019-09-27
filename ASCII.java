//Program to print ASCII value.
import java.util.Scanner;
public class ASCII
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c=sc.next().charAt(0);
        System.out.println("ASCII value of "+c+" is "+(int)c);
    }
}
