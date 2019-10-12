//Program to print the prime numbers upto a limit entered by the user.
//import java.util.Scanner;
public class Prime
{
    public static void pr(int n)
    {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the value upto which you want the prime numbers: ");
        //int n=sc.nextInt();
        int i, k=1;
        if(n>=2)
        {
            System.out.print("Prime factors of " + n + " are: ");
            while(k<=n)
            {
                i=2;
                while(i<k)
                {
                    if(k%i==0)
                    break;
                    else
                    i++;
                }
                if(i==k && n%i==0)
                System.out.print(k+" ");
                k++;
            }
            System.out.println("");
        }
        else
        System.out.println("Prime factors of " + n + " are: 2 3 5 ...");
    }
    public static void pr2(int n)
    {
       int i, k=1,j=0,l=0; 
       if(n>=2)
       {
           while(k<=n)
           {
               i=2;
               while(i<k)
               {
                   if(k%i==0)
                   break;
                   else
                   i++;
               }
               if(i==k && n%i==0)
               {
                   j++;l++;
               }
               k++;
       }
       System.out.println("Number of prime factors: "+j);
       int m=2;
       while(m<n)
       {
           if(n%m==0) 
           {
               System.out.println("Number is composite.");
               break;
           }
           m++;
       }
       if(m==n) 
       System.out.println("Number is prime.");
       System.out.println("Sum of prime factors: "+l);
       }
       else
       {
           System.out.println("Number of prime factors: infinite");
           System.out.println("Number is neither prime nor composite.");
           System.out.println("Sum of prime factors: infinite");
       }
    }
}