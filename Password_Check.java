//Program to Check First Name and Last Name
//DEBUGGED BY ANKAN PAL
import java.util.Scanner;
public class Password_Check
{
Scanner sc = new Scanner(System.in);
boolean q1,q2,a1,a2;
public void main()
{
System.out.println("\t\t\t\t\t\t\t\t\t\t\tWelcome! \n\n\nFirst let's verify it's you.");
System.out.println("\n\nEnter the information correctly in CAPITAL LETTERS to continue: ");
a1=First();
a2=Last();
if(a1 && a2)
System.out.println("\n\n\n\t\t\t\t\t\t\t\t\t\tWe have verified. It's you!");
}
public boolean First()
{
for(int i=1;i<4;i++)
{
System.out.println("\n\nFirst Name Tries: "+i+"\n\nEnter your first name: ");
String first=sc.next();
q1=(first.equals("SAYAN"))?true:false;
if(q1==true)
{
    a1=true;
    break;
}
if(i==3)
{
System.out.println("\n\n\n\t\t\t\t\t\t\t\t\tYou have crossed the number of trials! Access denied! ");
System.exit(0);
}
System.out.println("\n\n\nWrong Credentials! Try Again!");
}
return q1;
}
public boolean Last()
{
for(int i=1;i<4;i++)
{
System.out.println("\n\n\nLast Name Tries: "+i+"\n\n\nEnter your last name: ");
String last=sc.next();
q2=(last.equals("BISWAS"))?true:false;
if(q2==true)
{
a2=true;
break;
}
if(i==3)
{
System.out.println("\n\n\n\t\t\t\t\t\t\t\t\tYou have crossed the number of trials! Access denied! ");
System.exit(0);
}
System.out.println("\n\n\nWrong Credentials! Try Again!");
}
return q2;
}
}
