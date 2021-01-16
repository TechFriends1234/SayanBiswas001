public class Q4_ii
{
    public static void main()
    {
        double s=0;
        for(double a=1;a<=29;)
        {
            s+=a*(++a);
        }
        System.out.println("Sum: "+s);
    }
}