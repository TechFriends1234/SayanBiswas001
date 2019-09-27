//Program to convert a binary number to decimal number.
import java.util.Scanner;
public class BintoDeci
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number: ");
        int bin=sc.nextInt();
        double a=bin,deci=0,rem,i=0;
        while(bin>0)
        {    rem=bin%10;
             deci=deci+(rem*Math.pow(2,i));
             bin=bin/10;
             i++;
        }
        System.out.println("The Decimal equivalent of "+a+" is "+deci);
    }
}
