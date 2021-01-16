import java.util.*;
public class overloading
{
    static double v=0;
    double volume(double r)
    {
        v=(4/3)*Math.PI*r*r*r;
        System.out.println(v);
        return v;
    }
    double volume(double h,double r)
    {
        v=Math.PI*r*r*h;
        System.out.println(v);
        return v;
    }
    double volume(double l,double b,double h)
    {
        v=l*b*h;
        System.out.println(v);
        return v;
    }
    static void main()
    {
        Scanner in=new Scanner(System.in);
        overloading ob=new overloading();
        System.out.println("Press\n1=sphere\n2=cylinder\n3=cuboid");
        int ch;
        double r,l,b,h;
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter radius of sphere");
            r=in.nextDouble();
            ob.volume(r);
            break;
            case 2:
            System.out.println("Enter radius and height of sphere");
            r=in.nextDouble();
            h=in.nextDouble();
            ob.volume(r,h);
            break;
            case 3:
            System.out.println("Enter length,breadth and height of sphere");
            l=in.nextDouble();
            b=in.nextDouble();
            h=in.nextDouble();
            ob.volume(l,b,h);
            break;
        }
        System.out.println("Required volume is "+v);
    }
}