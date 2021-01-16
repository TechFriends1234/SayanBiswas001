class employee
{
    int pan;
    String name;
    double taxincome,tax;
    void input(int p,String n,double income)
    {
        pan=p;
        name=n;
        taxincome=income;
    }
    void calc()
    {
        if(taxincome<=25000)
        {
            tax=0.0;
        }
        else if(taxincome<=500000)
        {
            tax=1*(taxincome-250000);
        }
        else if(taxincome<=1000000)
        {
            tax=2*(taxincome-500000)+5000;
        }
        else
        {
            tax=3*(taxincome-1000000)+25000;
        }
    }
    void display()
    {
        System.out.println("Pan Number\tName\tTax-income\tTax");
        System.out.println(pan+"\t"+name+"\t"+taxincome+"\t"+tax);
    }
}