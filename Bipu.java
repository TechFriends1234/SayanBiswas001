import java.util.*;
import java.io.*;
public class Bipu
{
    public static Scanner sc = new Scanner(System.in);
    static double total,obt;
    static String a,b,sch,name,surname,clas;
    static String[] sub = new String[10];
    static char[] grd = new char[10];
    static double[] full = new double[10];
    static double[] got = new double[10];
    static double[] per = new double[10];
    public static void main(String[] args)throws IOException, InterruptedException 
    {
       if(Login()==true)
       {
           Data();
           Marksheet();
       }
       else
       Exit();
    }
    public static boolean Login()throws IOException, InterruptedException 
    {
        System.out.println("First, let's verify it's you...");
        System.out.print("Username: ");
        a = sc.nextLine();
        System.out.print("Password: ");
        b = sc.nextLine();
        System.out.println("");
        if (a.equals("BG")&&b.equals("2006"))
        {
            System.out.println("Welcome Biprajit Ghosh!");
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void Data()throws IOException, InterruptedException 
    {
        System.out.println("Enter your school name: ");
        sch = sc.nextLine();
        System.out.println("Enter your first name: ");
        name = sc.nextLine();
        System.out.println("Enter your surname: ");
        surname = sc.nextLine();
        System.out.println("Enter your class: ");
        clas = sc.nextLine();
        System.out.println("Enter the following details: ");
        for(int i=1;i<=10;i++)
        {
            if(i!=1)
            sc.nextLine();            
            System.out.println("Enter the subject "+i+": ");
            sub[i-1] = sc.nextLine();
            if (sub[i-1]==null)
            break;
            System.out.println("Total marks in "+sub[i-1]);
            full[i-1] = sc.nextDouble();
            System.out.println("Marks you got in "+sub[i-1]);
            got[i-1] = sc.nextDouble();
            per[i-1]=got[i-1]/full[i-1]*100;
            total+=full[i-1];
            obt+=got[i-1];
            grd[i-1]=(per[i-1]>85)?'A':(per[i-1]>75)?'B':(per[i-1]>60)?'C':(per[i-1]>50)?'D':'E';
        }
    }
    public static void Marksheet()throws IOException, InterruptedException 
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("---------------------Result Checker by Biprajit Ghosh-----------------------");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(sch);
        System.out.println("Name: "+name+" "+surname+"                Class: "+clas);
        System.out.println("| Subject\t\t\t| Total marks\\t| Marks Obtained\t| Percentage\t| Grade\t|");
        for(int i=1;i<=10;i++)
        System.out.println("|"+sub[i-1]+"\t\t\t|"+full[i-1]+"\t\t|"+got[i-1]+"\t\t|"+per[i-1]+"%\t\t|"+grd[i-1]+"\t|");
        System.out.println("Total marks: "+total+"\tMarks Obtained: "+obt+"\tPercentage: "+(obt/total)*100);
    }
    public static void Exit()
    {
        System.out.println("System % boot installed%");
        System.out.println("%AppData B-spyware by BG installed%");
        System.out.println("%new% %password*% &set&: 21062006");
        System.out.println("a = new(%userprofile%/%ipaddress%/%PC user%)");
        System.out.println("Send pc data to ip%bg.github.a%");
        System.out.println("You are hacked by Biprajit Ghosh");
        System.exit(0);
    }
}