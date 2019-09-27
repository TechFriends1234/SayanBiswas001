import java.util.Scanner;
public class Reverse
{
    public static void main()
    {
        int n,p,q,r;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a 3-digit number: ");
        n=sc.nextInt();
        r = n%10;
        p = (n/10)%10;
        q = n/100;
        System.out.println("The reverse of the number is "+r+p+q);
    }
}