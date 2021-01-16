import java.util.*;
class book
{
    String name;//store the name of the book.
    double price;//store the price of the book.
    double amt;//store the total amount of the book after discount.
    book()
    {
        name="";
        price=0.0;
        amt=0.0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book: ");
        name=sc.nextLine();
        System.out.println("Enter the price of the boook: ");
        price=sc.nextDouble();
    }
    void calc()
    {
        double dis =0.0;
        if(price<=1000)
        {
            dis=(price*2)/100;
        }
        else if(price>1000 && price <=3000)
        {
            dis=(price*10)/100;
        }
        else
        {
            dis=(price*25)/100;
        }
        amt=price-dis;
    }
    void display()
    {
        System.out.println("Name of the book is =\t"+name);
        System.out.println("The actual price was =\t"+price);
        System.out.println("The price after discount = \t"+amt);
    }
    public static void main(String args[])
    {
        book ob = new book();
        ob.input();
        ob.calc();
        ob.display();
    }
}