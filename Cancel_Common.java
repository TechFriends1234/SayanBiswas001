import java.util.*;
public class Cancel_Common
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String a,b;
        System.out.println("Enter a string: ");
        a=sc.next();
        System.out.println("Enter another string: ");
        b=sc.next();
        System.out.println("Uncommon String: ");
        Cancel_Common.cancel(a,b);
        Cancel_Common.cancel(b,a);
    }
    public static void cancel(String a, String b)
    {
        int i,j,c;
        for(i=0;i<a.length();i++)
        {
            for(j=0,c=0;j<b.length();j++)
            {
                if(a.charAt(i)==b.charAt(j))
                c++;
            }
            if(c==0)
            System.out.print(a.charAt(i));
        }
    }
}