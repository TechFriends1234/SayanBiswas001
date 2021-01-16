/*
 * Using switch write a menu driven program that:
 * 1. Check and display whether user is a composite is a composite number or not.
 * 2. Find the smallest digit of an integer that is input.
 * 3. Incorrect choice an error message should be displayed.
 */
import java.util.*;
class Number
{
    static void IsComposite(int n)
    {
        int i,c=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c>=1)
        System.out.println("Composite Numerber");
        else
        System.out.println("Not a Composite Numerber");
    }
    static void Smallest(int n)
    {
        int d=0,s=n%10;
        while (n!=0)
        {
            d=n%10;
            if(d<s)
            s=d;
            n=n/10;
        }
        System.out.println("Smallest digit is "+s);
    }
    static void Menu()
    {
        Scanner sc = new Scanner(System.in);
        int n,ch;
        System.out.println("Enter 1 to check whether the number is a composite is a composite number or not.");
        System.out.println("Enter 2 to find the smallest digit of an integer that is input");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Enter the number: ");
                    n=sc.nextInt();
                    IsComposite(n);
                    break;
            case 2: System.out.println("Enter the number: ");
                    n=sc.nextInt();
                    Smallest(n);
                    break;
            default: System.out.println("Invaalid Entry");
        }
    }
}