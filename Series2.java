import java.util.*;
public class Series2
{
    public static void main()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n=sc.nextInt();
        int s=1,t=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println(s);
            s+=i;
            t+=s;
        }
        System.out.println("Sum of series: "+t);
    }
}