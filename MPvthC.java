import java.util.*;
class A
{
public void display()
{
System.out.println("Super Class 1");
}
}
interface B
{
public void display1();
}
class C extends A implements B
{
public void display1()
{
System.out.println("Interface");
}
}
class MPvthC
{
public static void main(String args[])
{
C c=new C();
c.display1();
c.display();
}
}