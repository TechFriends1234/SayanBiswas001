import java.util.*;
public class Divi5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        int k=a;
        if(a%5==0)
        System.out.println("The number is divisible by 5.");
        else
        {
            for(int i=1;i<=4;i++)
            {
                if((a+i)%5==0)
                {
                    System.out.println("The number "+(a+i)+" is divisible by 5.");
                    break;
                }
                else if((a-i)%5==0)
                {
                    System.out.println("The number "+(a-i)+" is divisible by 5.");
                    break;
                }
            }
        }
    }
} 