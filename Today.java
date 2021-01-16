class Today
{
    static int a;
    char b;
    void input()
    {
        a=20;
        b='z';
    }
    void convert()
    {
        char c = (char)(a+b);
        System.out.println(c);
    }
    static void main()
    {
        Today t = new Today();
        t.input();
        t.convert();
    }
}