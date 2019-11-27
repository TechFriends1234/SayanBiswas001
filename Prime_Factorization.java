public class Prime_Factorization
{
    public static void pfact(int n)
    {
        int c=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                while(n%i==0)
                {
                    n=n/i;
                    c++;
                }
                if(n!=1)
                System.out.print(i+"^"+c+" X ");
                else
                System.out.print(i+"^"+c);
            }
            c=0;
        }
        System.out.println("");
    }
}