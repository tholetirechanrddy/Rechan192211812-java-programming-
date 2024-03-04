import java.util.*;
class P
{
public void display()
{
System.out.println("Parent");
}
}
class C1 extends P
{
public void display1()
{
System.out.println("Child1");
}
}
class C2 extends P
{
public void display2()
{
System.out.println("Child2");
}
}
class C3 extends P
{
public void display3()
{
System.out.println("Child3");
}
}
class HL
{
public static void main(String args[])
{
C3 c = new C3();
c.display3();
c.display();
C2 g = new C2();
g.display2();
C1 k = new C1();
k5.display1();
}
}