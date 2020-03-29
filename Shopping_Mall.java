import java.io.*;
import java.util.*;
public class Shopping_Mall
{
    static Scanner sc = new Scanner(System.in);
    static String s1,name,tname,email,pass,tpass;
    static int j;
    static long cntno;
    static double total1,total2;
    static final double dis1=25, dis2=20;
    static int[] sl = new int[30];
    static int[] qn = new int[30];
    static int[] rate = {100, 80, 60, 40, 15, 60, 95, 30, 6, 15, 20, 25, 60, 20, 150, 160, 180, 160, 40, 25, 70, 50, 60, 40, 65, 100, 70, 130, 40, 125};
    static String[] item = {"Meat", "Fish", "Pasta", "Rice", "Bread", "Flour", "Oil", "Milk", "Egg", "Butter", "Cheese", "Yogurt", "Onion", "Potato", "Garlic",
    "Ginger", "Tomato", "Capsicum", "Pumpkin", "Sugar", "Apple", "Banana", "Guava", "Cucumber", "Orange", "Pomegranate", "Grapes", "Kiwi", "Vinegar", "Honey"};
    static boolean a=false;
    static Properties properties = new Properties();
    public static void main(String args[])
    {
        Intro();
        if(s1.equalsIgnoreCase("NEW"))
        List();
        else if(SignIn())
        List();
        else
        SignIn();
        Calculate();
        Bill();
    }
    public static void Intro()
    {
        System.out.println("Welcome to Sayan's Online Shopping Mall!");
        while(a==false)
        {
            System.out.println("Are you 'NEW' or 'EXISTING' customer? ");
            s1=sc.next();
            if(s1.equalsIgnoreCase("NEW"))
            {
                a=true;
                SignUp();
            }
            if(s1.equalsIgnoreCase("EXISTING"))
            {
                a=true;
                SignIn();
            }
        }
    }
    public static void SignUp()
    {
        System.out.println("Create your account for free!");
        System.out.println("Enter your name: ");
        name=sc.next();
        sc.nextLine();
        System.out.println("Enter your contact number: ");
        cntno=sc.nextLong();
        System.out.println("Enter your email: ");
        email=sc.next();
        pass= name.charAt(0)+""+(int)(Math.random()*10)+""+ name.charAt(1)+""+(cntno/100000);
        System.out.println("Account created successfully. Your password is: ");
        System.out.print(pass + "\n\n");
        data();
    }
    public static boolean SignIn()
    {
        System.out.println("Welcome to SignIn wizard!");
        System.out.println("Enter your name: ");
        tname=sc.next();
        System.out.println("Enter your password: ");
        tpass=sc.next();
        if(tname.equals(properties.getProperty("Name")) && tpass.equals(properties.getProperty("Password")))
        return true;
        else 
        return false;
    }
    public static void data()
    {
        try 
        {
            
            properties.setProperty("Name", name);
            properties.setProperty("Password", pass);
            File file = new File("Shopping_Mall_Data.properties");
            FileOutputStream fileOut = new FileOutputStream(file);
            properties.store(fileOut, "Accounts");
            fileOut.close();
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    public static void List()
    {
        System.out.println("What would you like to order:-- ");
        System.out.println("Enter the serial number followed by quanity(0 to confirm and submit)");
        System.out.println("1. Meat-₹100/kg\t\t2. Fish-₹80/kg\t\t3. Pasta-₹60/packet\t4. Rice-₹40/kg\t\t5. Bread-₹15/packet ");
        System.out.println("6. Flour-₹60/kg\t\t7. Oil-₹95/packet\t8. Milk-₹30/packet\t9. Egg-₹6/unit\t\t10. Butter-₹15/packet ");
        System.out.println("11. Cheese-₹20/packet\t12. Yogurt-₹25/packet\t13. Onion-₹60/kg\t\t14. Potato-₹20/kg\t15. Garlic-₹150/kg ");
        System.out.println("16. Ginger-₹160/kg\t17. Tomato-₹180/kg\t18. Capsicum-₹160/kg\t19. Pumpkin-₹40/kg\t20. Sugar-₹25/kg ");
        System.out.println("21. Apple-₹70/kg\t\t22. Banana-₹50/kg\t23. Guava-₹60/kg\t\t24. Cucumber-₹40/kg\t25. Orange-₹65/kg ");
        System.out.println("26. Pomegranate-₹100/kg\t27. Grapes-₹70/kg\t28. Kiwi-₹130/kg\t\t29. Vinegar-₹40/bottle\t30. Honey-₹125/unit ");
        int i=0;
        do{
            if(sc.nextInt()==0)
            break;
            sl[i]=sc.nextInt();
            qn[i]=sc.nextInt();
            i++;
        }while(i<=sl.length);
    }
    public static void Calculate()
    {
        for(j=0;j<sl.length;j++)
        {
            total1+=rate[sl[j]]*qn[j];
            if(sl[j]==0)
            break;
        }
        if(s1=="NEW")
        total2=total1*(100-dis1)/100;
        else
        total2=total1*(100-dis2)/100;
    }
    public static void Bill()
    {
        System.out.println("--------------Bill--------------");
        System.out.println("Sl.No.\tItem\t\tRate\tQuantity\tTotal");
        for(int k=1;k<=j;k++)
        {
            System.out.println(k+"\t"+item[sl[k-1]]+"\t\t"+rate[sl[k-1]]+"\t"+qn[k-1]+"\t\t"+(rate[sl[k-1]])*(rate[sl[k-1]]));
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Total purchased amount: "+total1);
        System.out.println("Discount for "+s1+" customer: "+s1=="NEW"?dis1:dis2+"%");
        System.out.println("Net amount: "+total2);
    }
}