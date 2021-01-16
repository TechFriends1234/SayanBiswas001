import java.util.*;
class AreaOfTriangle 
{
    static Scanner sc= new Scanner(System.in);
    public static void main()
    {
        System.out.println("Enter your choice:\n1. Area of Equilateral Triangle\n2. Area of Isosceles Triangle\n3. Area of scalene triangle");
        int a = sc.nextInt();
        switch(a)
        {
            case 1: equilateral();break;
            case 2: isosceles();break;
            case 3: scalene();break;
            default: System.out.println("Wrong choice! Try again.");main();
        }
    }
    public static void equilateral() 
    {
        System.out.println("Enter the side of the Triangle:");
        double a= sc.nextDouble();
        double area=(Math.sqrt(3)/4)*(a*a);
        System.out.format("Area of Triangle is: %.2f",area);      
    }
     public static void isosceles()
    {
        System.out.println("Please enter length of same sided: ");
        double a = sc.nextDouble();
        System.out.println("Please enter side2 of isosceles triangle: ");
        double b = sc.nextDouble();
        double area = (b/4) * Math.sqrt((4 * a * a) - (b * b));
        System.out.format("Area of isosceles triangle is: %.2f",area);
    }
    public static void scalene() 
    {
        double a, b, c, s, Area;
        System.out.println("\n Please Enter Three sides of triangle: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        s = (a + b + c)/2; 
        Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("\n The Area of triangle = %.2f\n",Area);
    }
}