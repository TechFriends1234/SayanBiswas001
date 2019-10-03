/*Program to show the step-wise multiplication of 2 numbers.
This program is best with two 2-digit numbers.*/
import java.util.Scanner;//Importing Scanner class
public class Multiplication//Declaring class
{
    public static void main()//Declaring method main
    {
        System.out.println("***Enter 2-digit numbers only.***");
        int a,b,c,d,e,f,g,h,i;//Initializing variables
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();//Entering first number
        System.out.println("Enter another number: ");
        b=sc.nextInt();//Entering second number 
        c=a/10;d=a%10;e=b/10;f=b%10;//Seperating the one's and ten's digit
        System.out.println("     " + c + d);//Displays first number
        System.out.println("   X " + e + f);//Displays second number
        System.out.println("--------");
        g=(10*c+d)*f;
        h=(10*c+d)*e;
        h=h*10;
        if(h>999)
        {
            System.out.println("   0" + g);
            System.out.println(" + " + h);
            System.out.println("--------");
            i=g+h;
            System.out.println("   " + i);
        }
        else
        {
            System.out.println("   " + g);
            System.out.println(" + " + h);
            System.out.println("--------");
            i=g+h;
            System.out.println("   " + i);
        }
        System.out.println("--------");
    }
}