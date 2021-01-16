import java.util.*;
public class InWords
{
    static int h,t,o,a;
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        for(;;)
        {
            
            System.out.println("Enter any number from 1 to 999: ");
            a=sc.nextInt();
            if(a==-1) System.exit(0);
            InWords ob = new InWords();
            ob.digits(a);
            System.out.println(ob.Hundreds(h)+ob.Tens(t,o)+ob.Ones(t,o));
        }
    }
    public void digits(int n)
    {
        int k=n;
        h=k/100;k%=100;
        t=k/10;k%=10;
        o=k;
    }
    public String Hundreds(int a)
    {
        switch(a)
        {
            case 1: return "One Hundred ";
            case 2: return "Two Hundred ";
            case 3: return "Three Hundred ";
            case 4: return "Four Hundred ";
            case 5: return "Five Hundred ";
            case 6: return "Six Hundred ";
            case 7: return "Seven Hundred ";
            case 8: return "Eight Hundred ";
            case 9: return "Nine Hundred ";
            case 0: return "";
        }
        return "";
    }
    public String Tens(int a, int b)
    {
        switch(a)
        {
            case 1: switch(b)
                    {
                        case 0: return "Ten";
                        case 1: return "Eleven";
                        case 2: return "Twelve";
                        case 3: return "Thirteen";
                        case 4: return "Fourteen";
                        case 5: return "Fifteen";
                        case 6: return "Sixteen";
                        case 7: return "Seventeen";
                        case 8: return "Eighteen";
                        case 9: return "Nineteen";
                    }
            case 2: return "Twenty ";
            case 3: return "Thirty ";
            case 4: return "Forty ";
            case 5: return "Fifty ";
            case 6: return "Sixty ";
            case 7: return "Seventy ";
            case 8: return "Eighty ";
            case 9: return "Ninety ";
            case 0: return "";
        }
        return "";
    }
    public String Ones(int a, int b)
    {
        if(a==1) return "";
        switch(b)
        {
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 0: return "";
        }
        return "";
    }
} 