public class Pronic_Number
{
    public static void main(int a)
    {
        int k=0;
        for(int i=0;i<=a;i++)
        {
            if(i*(i+1)==a)
            {
                k=1;
                break;
            }
        }
        if(k==1)
            System.out.println("Pronic number");
        else
            System.out.println("Not a Pronic number");
    }
}