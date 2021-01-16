import java.util.*;
class Rectangle
{
    int length, breadth;
    Rectangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length (in metre): ");
        length=sc.nextInt();
        System.out.println("Enter length (in centimetre): ");
        breadth=sc.nextInt();
    }
    void main()
    {
        int l_cm=Conversion.mTocm(length);
        int area=Conversion.multiply(l_cm, breadth);
        System.out.println("Area is "+area+" sq. cm");
    }
}