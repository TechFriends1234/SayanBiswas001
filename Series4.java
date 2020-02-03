import java.util.*;
public class Series4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        double s=0;
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            s+=n/i;
            else
            s-=n/i;
        }
        System.out.println("Sum of series = "+s);
    }
}