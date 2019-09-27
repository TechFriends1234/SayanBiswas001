public class Satisfy
{
    public static int satis(int a,int b,int c,int d)
    {
        int x = (a*a*a+b*b*b+c*c*c==d*d*d)?0:-1;
        return x;
    }
}