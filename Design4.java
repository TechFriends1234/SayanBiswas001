public class Design4
{
    public static void main()
    {
        int a=0;
        for(int i=1;i<40;i++)
        {
            if(i%4!=0)
            System.out.print("0 ");
            else
            System.out.print("1 ");
            if(i%3!=0)
            System.out.print("0 ");
            else
            System.out.print((++a)+" ");
            System.out.println(" ");
        }
    }
}