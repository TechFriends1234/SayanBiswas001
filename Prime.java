//Program to print the prime numbers upto a limit entered by the user.
import java.util.Scanner;
public class Prime
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value upto which you want the prime numbers: ");
        int n=sc.nextInt();
        int i, k=1;
        System.out.println("Prime numbers between 1 and " + n + " are: ");
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
           if(i==k)
            System.out.println(k);
           k++;
       }
}
}