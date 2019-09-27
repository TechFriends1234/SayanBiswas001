//Program to add two numbers.
import java.util.Scanner;
public class sum 
{
    public static void sum()
    {
        int a,b,c;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter another number: ");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum is "+c);
    }
}