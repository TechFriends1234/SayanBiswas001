import java.util.*;
public class QVolume
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \n1 for cube\n2 for sphere: ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Enter side length: ");
                    double s=sc.nextDouble();
                    double v1=s*s*s;
                    System.out.println("Volume of cube is "+v1);
                    break;
            case 2: System.out.println("Enter radius: ");
                    double p=3.14;
                    double r=sc.nextDouble();
                    double v2=4/3*p*(r*r*r);
                    System.out.println("Volume of sphere is "+v2);
                    break;
            default:System.out.println("Wrong input!");
        }
    }
}