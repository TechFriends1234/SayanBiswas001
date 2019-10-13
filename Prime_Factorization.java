public class Prime_Factorization
{
    public static void pfact(int n)
    {
        int i=0, k=1,c=0,count=1,j=0;
        
        while(k<=n)
           {
               i=2;
               while(i<k)
               {
                   if(k%i==0)
                   break;
                   else
                   i++;
               }
               if(i==k && n%i==0)
               {
                   j++;
               }
               k++;
           }
           System.out.println(j);//no of prime factors
          i=0; k=1;c=0;count=1;
        int a1[] = new int[j];
        if(n>0)
        {
            while(k<=n)
            {
                i=2;
                while(i<k)
                {
                    if(k%i==0)
                    break;
                    else
                    i++;
                }
                if(i==k && n%i==0)
                {
                    System.out.println(i);
                    a1[c]=i;
                    c++;
                }
                k++;
            }
            
            
            
            
            for(int x=0;x<j;x++)
            {
                for(int y=x+1;y<j;y++)
                for(int z=x+1;z<y;z++)
                if(a1[x]!=a1[z])
                if(a1[x]==a1[y])
                count++;
                System.out.print(a1[x]+"^"+count+" x ");
                count=1;
            }
            System.out.println("");
            
        }
        else
        System.out.println("Prime factor of " + n + " are: 2 3 5 ...");
    }
}