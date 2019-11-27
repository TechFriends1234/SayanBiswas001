import java.util.*;
public class Series3
{
    public static void main()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                s+=i;
                System.out.println(i);
            }
            else
            {
                s-=i;
                System.out.println(-i);
            }
        }
        System.out.println("Sum of series: "+s);
    }
}