import java.util.*;
class cuboid
{
public void display()
{
int l=10,b=25,h=33;
System.out.println("Area of cuboid:"+(2((l*b)+(b*h)+(h*l)))
System.out.println("Volume of Cuboid:"+(l*b*h));
}
}
class rectangle extends cuboid
{
public void display1()
{
int l=10,b=20;
System.out.println("Area of rectangle:"+(l*b));
System.out.println("Perimeter of rectangle:"+(2(l+b)));
}
}
class shape
{
public static void main(String args[])
{
rectangle c=new rectangle();
c.display1();
c.display();
}
}