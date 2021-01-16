import java.util.*;
public class Overload
{
    void area(double b, double p)
    {
        System.out.print(0.5*b*p);
    }
    void area(double r)
    {
        System.out.print(Math.PI*r*r);
    }
    void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Overload ob = new Overload();
        System.out.println("Enter \n1 to calculate area of right angle triangle \n2 to calculate the area of a circle");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Enter the length of the base and the perpendicular:");
                    double p=sc.nextDouble();
                    double b=sc.nextDouble();
                    System.out.print("Area of right angle triangle is : ");
                    ob.area(b,p);
                    break;
            case 2: System.out.println("Enter the length of the radius:");
                    double r=sc.nextDouble();
                    System.out.print("Area of circle is : ");
                    ob.area(r);
                    break;
            default: System.out.println("Wrong input!");            
        }
    }
}