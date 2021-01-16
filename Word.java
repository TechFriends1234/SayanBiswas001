import java.util.*;
class Word 
{
    public static void main(String args[])
    {
        String string = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        string= in.nextLine();
        string=string.trim();
        System.out.println("First word of the sentence is : " + string.substring (0,string.indexOf (' ')));
        System.out.println("Last word of the sentence is : " + string.substring (string.lastIndexOf (' '), string.length()));
    }
}