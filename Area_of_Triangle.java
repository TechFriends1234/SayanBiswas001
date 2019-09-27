//Program to find area of a triangle when base and height are given.
import java.util.Scanner;
public class Area_of_Triangle
{
    public static void main()
    {
        double area,b,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        b=sc.nextDouble();
        System.out.println("Enter the height: ");
        h=sc.nextDouble();
        area=0.5*b*h;
        System.out.println("The area of the triangle is: "+area+" sq.units");
    }
}
