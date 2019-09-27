class StaticMethod
{
    static int instVar=10;
    static int staticVar=20;
    public static void staticmethod()
    {
        System.out.println(instVar);
        System.out.println(staticVar);
        StaticMethod sm=new StaticMethod();
        System.out.println(sm.instVar);
    }
}
public class StaticMethodDemo
{
    public static void main(String args[])
    {
        StaticMethod.staticmethod();
    }
}