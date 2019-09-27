//Program to add two numbers.
import java.util.Scanner;
public class Simple_Marksheet
{
    public static void sum()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int total=0,got=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+"Enter full marks: ");
            int fi=sc.nextInt();
            System.out.println(i+"Enter marks got: ");
            int gi=sc.nextInt();
            total=total+fi;
            got=got+gi;
        }
        System.out.println("Total marks "+total);
        System.out.println("Marks got "+got);
    }
}