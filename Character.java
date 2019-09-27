//Program to print ASCII value.
import java.util.Scanner;
public class Character
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an ASCII value: ");
        int a=sc.nextInt();
        System.out.println("Character value of "+a+" is "+(char)a);
    }
}
