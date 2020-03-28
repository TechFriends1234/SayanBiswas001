import java.util.*;
public class vghcvhg
{
    
public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1;
        boolean a=false;
        System.out.println("Welcome to Sayan's Online Shopping Mall!");
        while(a==false)
        {
            
            System.out.println("Are you 'NEW' or 'EXISTING' customer? ");
            System.out.println(sc.next()=="NEW");
            s1=sc.next();
            if(s1.equals("NEW"))
            {
                a=true;
                System.out.println("n");
                break;
            }
            if(s1=="EXISTING")
            {
                a=true;
                System.out.println("e");
                break;
            }
        }
    }
}