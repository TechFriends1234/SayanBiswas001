import java.util.*;

class Volume

{

public static void main(String args[])

{

int op;

double s, r, l, b, h, pi = 0.0;

pi = 3.14;

Scanner in = new Scanner(System.in);

System.out.println("Enter 1 for square, 2 for sphere, 3 for cuboid");

op = in.nextInt();

switch(op)

{

case 1 : System.out.println("Enter the side");

s = in.nextDouble();

v = Math.pow(s,3);

System.out.println("Volume" + v);

break;

case 2 : System.out.println("Enter the radius");

r = in.nextDouble();

v = (4.0 /3 )* pi * Math.pow(r,3);

System.out.println("Volume" + v);

break;

case 3 : System.out.println("Enter the length");

l = in.nextDouble();

System.out.println("Enter the breadth");

b = in.nextDouble(); System.out.println("Enter the height");

h = in.nextDouble();

v = l * b * h;

System.out.println("Volume" + v);

break;

default : System.out.println("Wrong Choice!!!");

}

}

}