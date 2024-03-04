import java.util.*;
class A
{
public void display()
{
System.out.println("Parent");
}
}
class B extends A
{
public void display1()
{
System.out.println("Child");
}
}
interface D
{
public void display2();
}
class C extends B implements D
{
public void display2()
{
System.out.println("Interface Class");
}
}
class hybrid
{
public static void main(String args[])
{
C c = new C();
c.display2();
c.display1();
c.display();
}
}