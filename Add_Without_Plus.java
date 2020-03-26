import java.util.*;
public class Add_Without_Plus
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a-(-b);
        System.out.print("Sum of the numbers is ");
        System.out.println(c);
    }
}