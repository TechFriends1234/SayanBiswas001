import java.util.*;
public class Shopping_Mall
{
    static Scanner sc = new Scanner(System.in);
    static String name,tname,email,pass,tpass;
    static int cntno;
    static int[] sl = new int[30];
    static int[] qn = new int[30];
    static int[] rate = {100, 80, 60, 40, 15, 60, 95, 30, 6, 15, 20, 25, 60, 20, 150, 160, 180, 160, 40, 25, 70, 50, 60, 40, 65, 100, 70, 130, 40, 125};
    public static void main()
    {
        System.out.println("Welcome to Sayan's Online Shopping Mall!");
        String s1;
        boolean a=false;
        while(a==false)
        {
            System.out.println("Are you 'NEW' or 'EXISTING' customer? ");
            s1=sc.next();
            if(s1==(String)"NEW")
            {
                a=true;
                SignUp();
                
            }
            if(s1=="EXISTING")
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
        System.out.println("Enter your contact number: ");
        cntno=sc.nextInt();
        System.out.println("Enter your email: ");
        email=sc.next();
        pass=name.charAt(0)+(int)(Math.random()*10)+name.charAt(1)+cntno/100000;
        System.out.println("Account created successfully. Your password is: ");
        System.out.print(pass);
    }
    public static void SignIn()
    {
        System.out.println("Welcome to SignIn wizard!");
        System.out.println("Enter your name: ");
        tname=sc.next();
        System.out.println("Enter your password: ");
        tpass=sc.next();
    }
    public static void data()
    {
        
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
        for(int i=0;i<=sl.length;i++)
        {
            sl[i]=sc.nextInt();
            qn[i]=sc.nextInt();
        }
    }
    public static void Calculate()
    {
        
    }
    
    
    
    
    
    
    
    
    
}