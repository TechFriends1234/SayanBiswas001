import java.util.*;
public class All_in_One
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter /n1 for drawing patterns \n2 for calculation \3 for series \4 for special numbers");
        int ch=sc.nextInt();
        All_in_One ob = new All_in_One();
        switch(ch)
        {
            case 1:ob.pattern();
                   break;
            case 2:ob.calculation();
                   break;
            case 3:ob.series();
                   break;
            case 4:ob.Special_Numbers();
                   break;
            case 5:All_in_One.End();
                   break;
            default:System.out.println("Wrong Input!");
        }
    }
    void pattern()
    {
        
    }
    void calculation()
    {
        
    }
    void series()
    {
        
    }
    void Special_Numbers()
    {
        
    }
    public static void End()
    {
        
    }
}