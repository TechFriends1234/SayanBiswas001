public class Factorial
{
    public static void fac(int a)
    {
        double fact=1;        
        if(a>=0)
        {
            for(int j=1;j<=a;j++)
            fact*=j;
            System.out.println(a+"! = "+fact);
        }
        else 
        System.out.println(a+"! = does not exist");
    }
}