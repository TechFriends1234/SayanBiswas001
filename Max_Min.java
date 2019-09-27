//Program to enter three numbers and find the maximum and minimum.
public class Max_Min
{
    public static void main(double a,double b,double c)
    {
        double max=max(a,b,c);
        double min=min(a,b,c);
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);
    }
    public static double max(double a,double b,double c)
    {
        double max=Math.max(Math.max(a,b),Math.max(a,c));
        return max;
    }
    public static double min(double a,double b,double c)
    {
        double min=Math.min(Math.min(a,b),Math.min(a,c));
        return min;
    }
}