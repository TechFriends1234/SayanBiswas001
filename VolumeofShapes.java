import java.util.*;
public class VolumeofShapes
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for finding volume of cube, 2 for sphere and 3 for cuboid: ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Enter the side of the cube: ");
                    int s=sc.nextInt();
                    volume(s);
                    break;
            case 2: System.out.println("Enter the radius of the sphere: ");
                    float r=sc.nextFloat();
                    volume(r);
                    break;
            case 3: System.out.println("Enter the sides of the cuboid: ");
                    int l=sc.nextInt();
                    int b=sc.nextInt();
                    int h=sc.nextInt();
                    volume(l,b,h);
                    break;
        }
    }
    public static void volume(int a)
    {
        System.out.println("Volume is "+Math.pow(a,3));
    }
    public static void volume(float a)
    {
        System.out.println("Volume is "+(4/3*Math.PI*Math.pow(a,3)));
    }
    public static void volume(int a, int b, int c)
    {
        System.out.println("Volume is "+a*b*c);
    }
    
}