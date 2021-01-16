class Swap
{
    int a,b;
    Swap(int x, int y)
    {
        a=x;
        b=y;
    }
    void change()
    {
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println(a+"\t"+b); 
    }
}