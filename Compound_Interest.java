//Program to calculate the compound interest.
import java.util.Scanner;
public class Compound_Interest
{
    public static void main()
    {
        double ci,b;
        //Enter 1 for compounding annually, 2 for compounding half-yearly and 3 for compounding quarterly.
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the principal amount: ");
       float p= sc.nextFloat();
       System.out.println("Enter the rate of interest: ");
       float r= sc.nextFloat();
       System.out.println("Enter the time period (in years): ");
       float n= sc.nextFloat();
       System.out.println("Enter 1 for compounding annually, 2 for compounding half-yearly and 3 for compounding quarterly: ");
       int a= sc.nextInt();
        switch (a)
        {
            case 1: b=Math.pow((1+(r/100)),n);
                    ci=(p*b)-p;
                    System.out.println("Compound interest is " + ci);
                    break;
            case 2: b=Math.pow((1+(r/200)),2*n);
                    ci=(p*b)-p;
                    System.out.println("Compound interest is " + ci);
                    break;
            case 3: b=Math.pow((1+(r/400)),4*n);
                    ci=(p*b)-p;
                    System.out.println("Compound interest is " + ci);
       }
    }
}