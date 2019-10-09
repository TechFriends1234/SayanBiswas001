public class Loop1
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            continue;
            if(i%25==0)
            break;
            System.out.println(i);
        }
    }
}
    