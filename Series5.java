import java.util.*;
public class Series5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n=sc.nextInt();
        long s2=0;
        for(int i=1;i<=n;i++)
        {
            long s1=1;
            for(int j=1;j<=i;j++)
            s1*=j;
            s2+=s1;
        }
        System.out.println("Sum of series = "+s2);
    }
}