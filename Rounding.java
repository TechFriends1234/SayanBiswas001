import java.util.*;
public class Rounding
{
    double n,r;
    Rounding()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        double a=sc.nextDouble();
        n=a;
    }
    public void round(double a)
    {
        r=Math.round(n*100.0)/100.0;
    }
    public void main()
    {
        round(n);
        System.out.println("n="+n);
        System.out.println("r="+r);
    }
}