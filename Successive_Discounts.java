import java.util.*;
public class Successive_Discounts
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a;
        double sp=0,mp;
        System.out.println("Enter the marked price: ");
        mp=sc.nextDouble();
        System.out.println("Enter number of discounts: ");
        a=sc.nextInt();
        for(int i=1;i<a;i++)
        {
            sp=mp;
            System.out.println("Enter discount rate: ");
            double dis=sc.nextDouble();
            sp=sp-(dis/mp);
        }
    }
}