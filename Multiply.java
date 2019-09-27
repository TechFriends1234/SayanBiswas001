//Program to multiply two numbers.
import java.util.Scanner;
public class Multiply
{
    public static void sum()
    {
        int a,b,c;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter another number: ");
        b=sc.nextInt();
        c=a*b;
        System.out.println("Product is "+c);
    }
}