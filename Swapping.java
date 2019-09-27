import java.util.*;
public class Swapping
{
    public static void WithoutUsing_3rdVariable()
    {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a=sc.nextDouble();
        System.out.println("Enter the value of b: ");
        b=sc.nextDouble();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The value of a is "+a);
        System.out.println("The value of b is "+b);
    }
    public static void Using_3rdVariable()
    {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a=sc.nextDouble();
        System.out.println("Enter the value of b: ");
        b=sc.nextDouble();
        c=a;
        a=b;
        b=c;
        System.out.println("The value of a is "+a);
        System.out.println("The value of b is "+b);
    }
}