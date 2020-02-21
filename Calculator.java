import java.util.*;
public class Calculator
{
    static double a,b,ans;
    static char c;
    public static void main()
    {
        System.out.println("\t\t\tCalculator");
        Calculator ob = new Calculator();
        ob.input();
        ob.calculate();
        System.out.println(ans);
    }
    public static void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a=sc.nextDouble();
        System.out.println("Enter first number: ");
        b=sc.nextDouble();
        System.out.println("Enter\n a for addition\n s for subtraction\n m for multiplication\n d for division: ");
        c=sc.next().charAt(0);
    }
    public static double calculate()
    {
        Sum x1 = new Sum();
        Difference x2 = new Difference();
        Product x3 = new Product();
        Division x4 = new Division();
        switch (c)
        {
            case 'a': ans=x1.add(a,b);break;
            case 's': ans=x2.subtract(a,b);break;
            case 'm': ans=x3.multiply(a,b);break;
            case 'd': ans=x4.divide(a,b);break;
            default: System.out.println("Wrong input");
        }
        return ans;
    }
}