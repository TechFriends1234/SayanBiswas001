import java.util.*;
public class Sumofdigits
{
    static int sum=0;
    public static void call()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        for(int i=1;i<=10;i++)
        {
            int n=sc.nextInt();
            sum(n);
            System.out.println("Sum of digits of "+n+" is: "+sum);
            sum=0;
        }
        
    }
    public static int sum(int n)
    {
        
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}