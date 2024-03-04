import java.util.*;
interface A
{
public void display();
}
interface B
{
public void display();
}
class C implements A,B
{
public void display1()
{
System.out.println("Interface");
}
public void display()
{
System.out.println("Interface");
}
}
class MP
{
public static void main(String args[])
{
C c=new C();
c.display1();
c.display();
}
}