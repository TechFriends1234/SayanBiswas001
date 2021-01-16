class Pattern554
{
    static void main()
    {
        String s="TRIAL";
        for(int i=4;i>=0;i--)
        {
            for(int j=i;j<=4;j++)
            System.out.print(s.charAt(j));
            System.out.println();
        }
    }
}