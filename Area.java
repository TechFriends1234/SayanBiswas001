import java.util.*;
public class Area
{
    public static void main()
    {
        double a=rectangle();
        System.out.println("Area of the rectangle is "+a);
    }
    public static double rectangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        double area=l*b;
        return area;
    }
}