import java.util.*;
public class Business
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double sp,cp,mp;
        System.out.println("Enter the cost price: ");
        cp=sc.nextDouble();
        System.out.println("Enter the marked price: ");
        mp=sc.nextDouble();
        System.out.println("Enter the selling price: ");
        sp=sc.nextDouble();
        if(sp>cp)
        {
            double profit,profitper,dis,disper;
            profit=sp-cp;
            profitper=profit/cp*100;
            dis=mp-sp;
            disper=dis/mp*100;
            System.out.println("Profit amount: "+profit);
            System.out.println("Profit percentage: "+profitper+"%");
            System.out.println("Discount amount: "+dis);
            System.out.println("Discount percentage: "+disper+"%");
        }
        else if(cp>sp)
        {
            double loss,lossper,dis,disper;
            loss=cp-sp;
            lossper=loss/cp*100;
            dis=mp-sp;
            disper=dis/mp*100;
            System.out.println("Loss amount: "+loss);
            System.out.println("Loss percentage: "+lossper+"%");
            System.out.println("Discount amount: "+dis);
            System.out.println("Discount percentage: "+disper+"%");
        }
        else
        System.out.println("No profit no loss!");
    }
}