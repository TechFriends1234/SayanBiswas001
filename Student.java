import java.util.*;
class Student
{
    String name;
    double m1, m2, m3, max, avg;
    int age;
    Student(double m1, double m2, double m3, int age, String name)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.age=age;
        this.name=name;
    }
    void calculate()
    {
        max=(Math.max(m1,Math.max(m2,m3)));
        avg=(m1+m2+m3)/3;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks in 1st Subject: "+m1);
        System.out.println("Marks in 2nd Subject: "+m2);
        System.out.println("Marks in 3rd Subject: "+m3);
        System.out.println("Maximum: "+max);
        System.out.println("Average: "+avg);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String nam="";
        double ma1=0,ma2=0,ma3=0;
        int age1=0;
        System.out.println("Enter name");
        nam=sc.nextLine();
        System.out.println("Enter age: ");
        age1=sc.nextInt();
        System.out.println("Enter marks in three subjects: ");
        ma1=sc.nextDouble();
        ma2=sc.nextDouble();
        ma3=sc.nextDouble();
        Student ob1 = new Student(ma1,ma2,ma3,age1,nam);
        ob1.calculate();
        ob1.display();
    }
}