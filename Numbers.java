class Numbers
{
    int a,b,c;
    Numbers(int x, int y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
        System.out.println("Value of c is "+c);
    }
    void compute()
    {
        c=a+b;
    }
    static void main(String args[])
    {
        Numbers ob = new Numbers(5,6);
        ob.compute();
        ob.show();
    }
}