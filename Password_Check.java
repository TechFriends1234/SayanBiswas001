import java.util.*;
public class Password_Check
{
    Scanner sc = new Scanner(System.in);
    boolean q1,q2,q3,a1,a2,a3;
    public void main()
    {
        System.out.println("Welcome! \n First let's verify it's you.");
        System.out.println("Enter the information correctly in CAPITAL LETTERS to continue: ");
        a1=First();
        a2=Last();
        if(a1==true && a2==true)
        System.out.println("We have verified. It's you!");
    }
    public boolean First()
    {
        for(int i=1;i<4;i++)
        {
            System.out.println("Try number: "+i+"\nEnter your first name: ");
            String first=sc.next();
            q1=(first=="SAYAN")?true:false;
            if(q1==true)break;
            if(i==3)
            {
                System.out.println("You have crossed the number of trials! Access denied! ");
                System.exit(0);
            }
        }
        return q1;
    }
    public boolean Last()
    {
        for(int i=1;i<4;i++)
        {
            System.out.println("Try number: "+i+"\nEnter your last name: ");
            String last=sc.next();
            if(last=="BISWAS")
            {
                q2=true;
                break;
            }
            if(i==3)
            {
                System.out.println("You have crossed the number of trials! Access denied! ");
                System.exit(0);
            }
        }
        return q2;
    }
}
