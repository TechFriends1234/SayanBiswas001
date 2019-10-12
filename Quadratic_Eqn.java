import java.util.*;
public class Quadratic_Eqn
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a,b,c: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=Math.sqrt(b*b-4*a*c);
        double x1=(-b+d)/(2*a);
        double x2=(-b-d)/(2*a);
        if(d>=0)
        System.out.println("Roots of the equation are: "+x1+"\t"+x2);
        else
        System.out.println("Roots of the equation are imaginary.");
    }
}