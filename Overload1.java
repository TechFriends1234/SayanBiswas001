import java.util.*;
public class Overload1
{
    void Joystring(String s, char ch1, char ch2)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch1)
            System.out.print(ch2);
            else
            System.out.print(s.charAt(i));
        }
    }
    void Joystring(String s)
    {
        System.out.println("First Index = "+s.indexOf(32));
        System.out.println("Second Index = "+s.lastIndexOf(32));
    }
    void Joystring(String s1, String s2)
    {
        System.out.println(s1.concat(" ").concat(s2));
    }
}