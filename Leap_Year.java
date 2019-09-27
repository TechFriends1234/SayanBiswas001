//Program to check if a year is a leap year or not.
import java.util.Scanner;
public class Leap_Year
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a year: ");
        int year=sc.nextInt();
        if (year%4==0)
        {
            if (year%100==0)
            {
                if (year%400==0)
                System.out.println(year + " is a leap year");
                else
                System.out.println(year + " is a not leap year");
            }
            else
                System.out.println(year + " is a leap year"); 
        }
        else
            System.out.println(year + " is a not leap year");
    }
}