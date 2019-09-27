class Static
{
    static int m=0;
    static int n=0;
    public void Test()
    {
        int m=10;
        int x=20;
        {
            int n=30;
            System.out.println("m+n="+m+n);
        }
        x=m+n;
        System.out.println("x="+x);
    }
}