import java.util.*;
class Char_by_Char
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++)
        System.out.println(a.charAt(i));
    }
}