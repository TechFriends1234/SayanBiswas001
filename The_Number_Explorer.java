import java.util.Scanner;
public class The_Number_Explorer
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int a=sc.nextInt();
        if(a<0)
        {
            System.out.println("Wrong input!");
            System.exit(0);
        }
        Plusve_Minusve.test(a);
        Factorial.fac(a);
        Factors.factor(a);
        Prime.pr(a);
        Prime.pr2(a);
        Prime_Factorization.pfact(a);
        String st=(a%2==0)?"The number is even.":"The number is odd.";
        System.out.println(st);
    }
}