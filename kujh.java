import java.util.*;
public class kujh
{
    public static void main(String args[])
    {
        int c = 0,d=0;
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println("Enter a Sentence");
        n = sc.nextLine();
        for(int i=0;i<n.length();i++)
        {
           if (n.charAt(i).isUppercase)
                c++;
           else if(n.charAt(i).isLowercase)
                d++;
        }
        System.out.println("No of capital = " +c);
        System.out.println("No of small = " +d);
    }
}