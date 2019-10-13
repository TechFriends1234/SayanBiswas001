public class Factors
{
    public static void factor(int a)
    {
        System.out.print("Factors of "+a+" are: ");
        int i=0,k=0,l=0;
        if(a!=0)
        {
            for(i=1,k=0;i<=a;i++)
            if(a%i==0)
            {
                System.out.print(i+" ");
                l=l+i;
                k++;
            }
            System.out.println("\nNumber of factors of "+a+" is: "+k);
        }
        else
        {
            System.out.print("Infinite");
            System.out.println("\nNumber of factors of "+a+" is: infinite");
        }
        if(a>0)
        System.out.println("Sum of factors of "+a+" is: "+l);
        if(a==0)
        System.out.println("Sum of factors of "+a+" is: infinite");
    }
}