public class SimpleInterest
{
    public static void main(double p,double r, double t)
    {
        SimpleInterest.SI(p,r,t);
        SimpleInterest test = new SimpleInterest();
        test.Si(p,r,t);
    }
    public static void SI(double p,double r, double t)
    {
        double si=(p*r*t)/100;
        System.out.println(si);
    }
    public void Si(double p,double r, double t)
    {
        double si=(p*r*t)/100;
        System.out.println(si);
    }
}