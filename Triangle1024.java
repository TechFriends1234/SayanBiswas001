import java.util.*;
public class Triangle1024
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        
    }
    public static boolean triangle_check(double a, double b, double c)
    {
        if(a+b>c || b+c>a || c+a>b)
        return true;
        return false;
    }
}