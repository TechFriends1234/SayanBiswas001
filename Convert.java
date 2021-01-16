import java.util.*;
public class Convert
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Distance();
        Temperature();
        Unit();
    }
    public static void Distance()
    {
        System.out.println("Distance Converter");
        System.out.println("Enter the distance in miles: ");
        double a =sc.nextDouble();
        System.out.println("Enter the distance in yards:");
        double b =sc.nextDouble();
        System.out.println("Enter the distance in feet:");
        double c =sc.nextDouble();
        System.out.println("Enter the distance in inches:");
        double d =sc.nextDouble();
        double km=a*1.60934;
        double m=b*0.9144;
        double cm=(c*12+d)*2.54;
        System.out.println("Kilometres: "+km);
        System.out.println("Metres: "+m);
        System.out.println("Centimetres: "+cm);
    }
    public static void Temperature()
    {
        System.out.println("Degree Converter");
        System.out.println("Enter temperature in degree faahrenheit: ");
        double f = sc.nextDouble();//c/5=(f-32)/9
        double c = 5*(f-32)/9;
        System.out.println(f+" Fahrenheit is "+c+" Centigrade");
    }
    public static void Unit()
    {
        System.out.println("Enter the number of standard kilobytes: ");
        double a =sc.nextDouble();
        final double c=0.9765625;
        System.out.println(a+" Standard Kilobyte is "+a*c+"kilobyte");
        System.out.println(a+" Standard Kilobyte is "+a*c/1024+"megabyte");
        System.out.println(a+" Standard Kilobyte is "+a*c/Math.pow(1024,2)+"gigabyte");
        System.out.println(a+" Standard Kilobyte is "+a*c/Math.pow(1024,3)+"terabyte");
        System.out.println(a+" Standard Kilobyte is "+a*c/Math.pow(1024,4)+"petabyte");
    }
}