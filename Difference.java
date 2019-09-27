//Program to subtract two numbers.
import java.util.Scanner;
public class Difference
{
    public static void sum()
    {
        int a,b,c;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter another number: ");
        b=sc.nextInt();
        c=a-b;
        System.out.println("Difference is "+c);
    }
}