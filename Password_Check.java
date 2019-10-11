import java.util.Scanner;
public class Password_Check
{
    Scanner sc = new Scanner(System.in);
    boolean q1,q2,q3,a1,a2,a3;
    public void main()
    {
        System.out.println("\t\t\tWelcome!\nFirst let's verify it's you.");
        System.out.println("Enter the information correctly in CAPITAL LETTERS to continue: ");
        a1=First();
        a2=Last();
        a3=Password();
        if(a1 && a2)if(a3=true)
        System.out.println("\n\t\t\tWe have verified. It's you!");
    }
    public boolean First()
    {
        for(int i=1;i<4;i++)
        {
            System.out.println("Enter your first name: ");
            String first=sc.next();
            q1=(first.equals("SAYAN"))?true:false;
            if(q1==true)break;
            if(i==3)
            {
                System.out.println("\tYou have crossed the number of trials! Access denied! ");
                System.exit(0);
            }
            System.out.println("\nWrong Credentials! Try Again!");
        }
        return q1;
    }
    public boolean Last()
    {
        for(int i=1;i<4;i++)
        {
            System.out.println("Enter your last name: ");
            String last=sc.next();
            q2=(last.equals("BISWAS"))?true:false;
            if(q2==true)break;
            if(i==3)
            {
                System.out.println("\tYou have crossed the number of trials! Access denied! ");
                System.exit(0);
            }
            System.out.println("\nWrong Credentials! Try Again!");
        }
        return q2;
    }
    public boolean Password()
    {
        for(int i=1;i<4;i++)
        {
            System.out.println("Enter your password: ");
            String pass=sc.next();
            q2=(pass.equals("SB2004"))?true:false;
            if(q2==true)break;
            if(i==3)
            {
                System.out.println("\tYou have crossed the number of trials! Access denied! ");
                System.exit(0);
            }
            System.out.println("\nWrong Credentials! Try Again!");
        }
        return q3;
    }
}
