//Program to print the table of a number.
import java.util.Scanner;
public class Table
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number whose table you want: ");
        int a=sc.nextInt();
        int i=1;
        while(i <= 20)
        {
            System.out.println(a+" x "+i+" = "+a*i);
            i++;
        }
    }
}