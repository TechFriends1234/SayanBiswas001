public class Design3
{
    public static void main()
    {
        for(char ch='a';ch<='z';ch++)
        System.out.print(ch+" ");
        System.out.println("");
        int i=1,j=49;
        for(char ch2='b',ch3='y';ch2<='y';ch2++,ch3--)
        {
        String p = new String(new char[i]).replace("\0"," ");
        System.out.print(p);
        System.out.print(ch2);
        String q = new String(new char[j]).replace("\0"," ");
        System.out.print(q);
        System.out.print(ch3);
        System.out.println("");
        i++;
        }
        String r = new String(new char[i]).replace("\0"," ");
        System.out.print(r);
        for(char ch4='z';ch4>='a';ch4--)
        System.out.print(ch4+" ");
    }
}