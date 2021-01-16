import java.util.*;
class szfgcuzs
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char a= sc.next().charAt(0);
        
        
        if(Character.isLetter(a))
            {
                System.out.println(a+" is a letter!");
                if(Character.isUpperCase(a))
                    System.out.println(a+" is in uppercase!");
                else
                    System.out.println(a+" is in lowercase!");
            }
        else if(Character.isDigit(a))
            System.out.println(a+" is a digit!");
        else
            System.out.println(a+" is a Special Character");
    }
}