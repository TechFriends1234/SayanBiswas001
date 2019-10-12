import java.util.Scanner;
public class Details
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a=sc.nextInt();
        if(a>0)
        System.out.println("\nIt is positive.");
        else if(a<0)
        System.out.println("\nIt is negative.");
        else
        System.out.println("\nIt is neither positive nor negative.");
        System.out.print("Factors of "+a+" are: ");
        int i=0,k=0,l=0;
        double fact=1;
        if(a!=0)
        {
            for(i=1,k=0;i<=a;i++)
            if(a%i==0)
            {
                System.out.print(i+" ");
                l=l+i;
                k++;
            }
            System.out.println("\nNumber of factors of "+a+" is: "+k);
        }
        else
        {
            System.out.print("Infinite");
            System.out.println("\nNumber of factors of "+a+" is: infinite");
        }
        if(a>0)
        System.out.println("Sum of factors of "+a+" is: "+l);
        if(a==0)
        System.out.println("Sum of factors of "+a+" is: infinite");
        if(a>=0)
        {
            for(int j=1;j<=a;j++)
            fact*=j;
            System.out.println(a+"! = "+fact);
        }
        else 
        System.out.println(a+"! = does not exist");
        Prime.pr(a);
        Prime.pr2(a);
        String st=(a%2==0)?"The number is even.":"The number is odd.";
        System.out.println(st);
    }
}