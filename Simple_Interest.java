//Program to calculate the simple interset.
import java.util.Scanner; 
public class Simple_Interest
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        int p=sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        int r=sc.nextInt();
        System.out.println("Enter the time period (in years): ");
        int t=sc.nextInt();
        float si;
        si=p*r*t/100;
        System.out.println("Simple interest is " + si);
    }
}