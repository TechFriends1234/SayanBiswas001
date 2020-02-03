import java.util.*;
public class Practice
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        final int n = sc.nextInt();
        final String num=Integer.toString(n);
        System.out.println("Testing for its specialities...");
        for(int td=1;td<=100;td++)
        System.out.print("");
        /*
         * A number is said to be the Disarium number when the sum of its digit raised to the power of their respective positions is equal to the number itself. 
         * Some of the other examples of Disarium number are 89, 135, 518 etc.
         */
        int s=0;
        for(int a=n,c=1;a>0;a%=Math.pow(10,num.length()-1),c++)
        {
            int b=a/(int)Math.pow(10,num.length()-1);
            s+=Math.pow(b,c);
        }
        if(s==n)
        System.out.println("The number is a Disarium number.");
        else
        System.out.println("The number is not a Disarium number.");
    }
}