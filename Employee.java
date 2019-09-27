public class Employee
{
    public static void empno(double basic, double hra, double da)
    {
        Employee.basicpay(basic,hra,da);
    }
    public static void basicpay(double basic, double hra, double da)
    {
        double gross_pay=basic+basic*hra/100+basic*da/100;
        double net_pay=gross_pay-15*gross_pay/100;
        System.out.println("Payslip");
        System.out.println("Basic: "+basic);
        System.out.println("Gross pay: "+gross_pay);
        System.out.println("Net pay: "+net_pay);        
    }
}