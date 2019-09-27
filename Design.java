public class Design
{
    public static void main(String args[])
    {
        int i=25,j=1;
        for(char ch='a';ch<='z';ch++)
        {
            String s = new String(new char[i]).replace("\0"," ");
            System.out.print(s);
            for(char ch2=ch;ch2>='b';ch2--)
            System.out.print(ch2);
            System.out.print("a");
            for(char ch2='b';ch2<=ch;ch2++)
            System.out.print(ch2);
            System.out.println("");
            i--;
        }
        for(char ch='y';ch>='a';ch--)
        {
            String s = new String(new char[j]).replace("\0"," ");
            System.out.print(s);
            j++;
            for(char ch2=ch;ch2>='b';ch2--)
            System.out.print(ch2);
            System.out.print("a");
            for(char ch2='b';ch2<=ch;ch2++)
            System.out.print(ch2);
            System.out.println("");
        }
    }
}