//Program to check if a number is neon number or not.
import java.util.*;
public class Neon_Number
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int a=n*n,s=0;
        while(a>0)
        {
            s+=a%10;
            a/=10;
        }
        if(s==n)
        System.out.println("Neon number!");
        else
        System.out.println("Not a Neon number!");
    }
}