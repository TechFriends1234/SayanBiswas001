import java.util.*;
public class SpyNumber
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int t,sum=0,pr=1;
        while(num>0)
        {
            t=num%10;
            sum+=t;
            pr*=t;
            num/=10;
        }
        if(sum==pr)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");
    }
}