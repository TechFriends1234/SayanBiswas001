//Program to print a mark sheet. Made By: Sayan Biswas(BUGGED)--------DEBUG : Ankan Pal
import java.util.Scanner;
public class Marksheet2
{
      float average=0;
      int totalper=0,total=0,got=0,n;
      char grdtotal='X';
      int[] f = new int[n];
      int[] g = new int[n];
      int[] per = new int[n];
      char[] grd = new char[n];
      int i=0;
    Marksheet2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of tests: ");
        int n=sc.nextInt();
        int[] f = new int[n];
        int[] g = new int[n];
        int[] per = new int[n];
        for(int j=1;i<n;i++,j++)
        {
            System.out.println("Enter full marks in test "+j+" : ");
            f[i]=sc.nextInt();
            System.out.println("Enter marks got in test "+j+" : ");
            g[i]=sc.nextInt();
            total=total+f[i];
            got=got+g[i]; 
            (per[i])=((g[i]*100)/f[i]);
        }
        gap();
        calculate();
        output();
    }
    void gap()
    {
        for(int l=1;l<=15;l++)
        {
            System.out.println("-\t\t\t\t\t\t\t\t/\t\t\t\t\t\t\t\t-");
            System.out.println("/\t\t\t\t\t\t\t\t-\t\t\t\t\t\t\t\t/");
        }
    }
    void calculate()
    {
        average=got/3;
        totalper=((got*100)/total);
        i=0;
        for(int x=0;x<n;x++,i++)
        {
            grd[i]=(per[i]>=90)?'A':(per[i]>=70)?'B':(per[i]>=50)?'C':'D';
        }
        grdtotal=(totalper>=90)?'A':(totalper>=70)?'B':(totalper>=50)?'C':'D';
    }
    void output()
    {
        System.out.println("\tExamination");
        int y=1;i=0;
        while(y<=n && i<n)
        {
            System.out.println("Marks got in test "+y+" -> "+g[i]+"/"+f[i]);
            System.out.println("Percentage -> "+per[i]+" %");
            System.out.println("Grade -> "+grd[i]);
            y++;i++;
        }
        System.out.println("Marks got in total -> "+got+"/"+total);
        System.out.println("Total Percentage -> "+totalper);
        System.out.println("Total Grade -> "+grdtotal);
    }
    void main()
    {
        Marksheet2 obj=new Marksheet2();
    }
}
