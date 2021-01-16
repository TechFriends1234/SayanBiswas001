import java.util.*;
class Q1
{
    static void main(String[]args)
    {
        int i,j,k,c;
        String n[] = new String[9];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nine elements: ");
        for(i=0;i<9;i++)
        n[i]=sc.next();
        for(j=0;j<9;j++)
        {
            for(k=0;k<9;k++)
            {
                if(j==k) continue;
                if(n[j].equals(n[k])) 
                break;
            }
            if(k==8) 
            System.out.println(n[k]+" is found only once!");
        }
        
    }
}