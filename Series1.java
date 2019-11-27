import java.util.*;
public class Series1
{
    public static void main()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            s+=(i*i);
            System.out.println(i*i);
        }
        System.out.println("Sum of series: "+s);
    }
}