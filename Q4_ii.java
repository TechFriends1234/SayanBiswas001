//      1/2 + 2/3 + 4/5 + 6/7 + 10/11 + ....... + 28/29
public class Q4_ii
{
    public static void main()
    {
        double s=0;
        for(double a=1;a<29;)
        {
            s+=a/(++a);
        }
        System.out.println("Sum: "+s);
    }
}