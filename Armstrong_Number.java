//Program to check if a number is armstrong number or not.
import java.util.*;
public class Armstrong_Number
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i=0,a=n,b=n,s=0;
        while(a>0)
        {
            a=a/10;
            i++;
        }
        while(b>0)
        {
            s=s+(int)Math.pow(b%10,i);
            b/=10;
        }
        if(s==n)
        System.out.println("Armstrong number!");
        else
        System.out.println("Not an Armstrong number!");
    }
}