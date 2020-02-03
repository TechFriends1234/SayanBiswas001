import java.util.*;
public class All_in_One
{
    Scanner sc = new Scanner(System.in);
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \n1 for drawing patterns \n2 for calculation \n3 for series \n4 for special numbers");
        int ch=sc.nextInt();
        All_in_One ob = new All_in_One();
        switch(ch)
        {
            case 1:ob.pattern();
                   break;
            case 2:ob.calculation();
                   break;
            case 3:ob.series();
                   break;
            case 4:ob.Special_Numbers();
                   break;
            default:System.out.println("Wrong Input!");
        }
        All_in_One.End();
    }
    void pattern()
    {
        System.out.println("Drawing six patterns: ");
        System.out.println("Enter the size of triangle: ");
        int n=sc.nextInt();
        System.out.println("Pattern 1: ");
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=n-1;j>=i;j--)
                System.out.print(" ");
                for(int k=1;k<=i;k++)
                System.out.print("*");
                System.out.println();
            }
        }
        System.out.println("Pattern 2: ");
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                System.out.print("*");
                System.out.println();
            }
        }
        System.out.println("Pattern 3: ");
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<i;j++)
                System.out.print(" ");
                for(int k=n;k>=i;k--)
                System.out.print("*");
                System.out.println();
            }
        }
        System.out.println("Pattern 4: ");
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=n;j>=i;j--)
                System.out.print("*");
                System.out.println();
            }
        }
        System.out.println("Enter the size of square: ");
        int o=sc.nextInt();
        {
            for(int i=1;i<=o;i++)
            {
                for(int j=1;j<=o;j++)
                System.out.print("* ");
                System.out.println();
            }
        }
        System.out.println("Enter the length and breadth of rectangle: ");
        int p=sc.nextInt();
        int q=sc.nextInt();
        {
            for(int i=1;i<=q;i++)
            {
                for(int j=1;j<=p;j++)
                System.out.print("* ");
                System.out.println();
            }
        }
    }
    void calculation()
    {
        System.out.println("Calculating Compound Interest: ");
        double ci,b;
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
    void series()
    {
        
    }
    void Special_Numbers()
    {
        
    }
    public static void End()
    {
        System.out.println("Exitting the program...");
        System.exit(0);
    }
}