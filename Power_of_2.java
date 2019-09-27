public class Power_of_2
{
    public static void main(double x)
    {
        int i=2,j=1,k=0;
        while(Math.pow(i,j)<=x)
        {
            if(Math.pow(i,j)==x)
            k=1;
            j++;
        }
        if(k==1)    
            System.out.println("Power of 2");
        else
            System.out.println("Not a power of 2");
    }
}