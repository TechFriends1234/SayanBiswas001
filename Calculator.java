import java.util.*;
public class Calculator
{
    double a,b,ans;
    char c;
    public void main()
    {
        System.out.println("\t\t\t<b>Calculator</b>");
        input();
        calculate();
        System.out.println(ans);
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a=sc.nextDouble();
        System.out.println("Enter first number: ");
        b=sc.nextDouble();
        System.out.println("Enter\n a for addition\n s for subtraction\n m for multiplication\n and d for division: ");
        c=sc.next().charAt(0);
    }
    public double calculate()
    {
        Sum x1 = new Sum();
        Difference x2 = new Difference();
        Product x3 = new Product();
        Division x4 = new Division();
        switch (c)
        {
            case 'a': ans=x1.add(a,b);
            case 's': ans=x2.subtract(a,b);
            case 'm': ans=x3.multiply(a,b);
            case 'd': ans=x4.divide(a,b);
            default: System.out.println("Wrong input");
        }
        return ans;
    }
}