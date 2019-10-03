public class Design2
{
    public static void main()
    {
        int i=25,j=1;
        String p = new String(new char[i]).replace("\0"," ");
        System.out.print(p);System.out.println("a");
        for(char ch='b';ch<='z';ch++)
        {
            String q = new String(new char[i]).replace("\0"," ");
            System.out.print(q);System.out.print(ch);
            String r = new String(new char[j]).replace("\0"," ");
            System.out.print(r);System.out.print(ch);
            System.out.println("");
            i--;j=j+2;
        }
        int k=2,l=47;
        for(char ch2='y';ch2>='b';ch2--)
        {
            String r = new String(new char[k]).replace("\0"," ");
            System.out.print(r);System.out.print(ch2);
            String s = new String(new char[l]).replace("\0"," ");
            System.out.print(s);System.out.print(ch2);
            System.out.println("");
            k++;l=l-2;
        }
        int m=26;
        String t = new String(new char[m]).replace("\0"," ");
        System.out.print(t);System.out.println("a");
    }
}