//Program on converting decimal to binary.
import java.util.Scanner;
public class DecitoBin
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number: ");
        int deci=sc.nextInt();
        double a=deci,rem,base=1,bin=0;
        while(deci>0)
	{
		rem=deci%2;
		bin=bin+rem*base;
		deci=deci/2;
		base=base*10;
	}
        System.out.println("The Binary equivalent of "+a+" is "+bin);
    }
}
