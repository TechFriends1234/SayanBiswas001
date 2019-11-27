public class Power_of_n
{
    /*
     * n=base
     * x=number
     */
    public static void main(int n,int x)
    {
        int j=1,k=0;
        while(Math.pow(n,j)<=x)
        {
            if(Math.pow(n,j)==x)
            k=1;
            j++;
        }
        if(k==1)    
            System.out.println("Power of "+n);
        else
            System.out.println("Not a power of "+n);
    }
}