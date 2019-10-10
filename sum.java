//Program to add two numbers.
import java.util.Scanner;
public class sum 
{
    Scanner sc = new Scanner(System.in);
    boolean q1;
    public static void sum()
    {
        int a,b,c;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter another number: ");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum is "+c);
    }
    public boolean First()
    {
        for(int i=1;i<4;i++)
        {
            System.out.println("Try number: "+i+"\nEnter your first name: ");
            String first=sc.next();
            q1=(first!="SAYAN")?true:false;
            if(q1==true)break;
            if(i==3)
            {
                System.out.println("You have crossed the number of trials! Access denied! ");
                System.exit(0);
            }
        }
        return q1;
    }
}