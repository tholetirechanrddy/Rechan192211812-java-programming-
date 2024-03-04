import java.util.*;
class P
{
int x=10;
public void display()
{
System.out.println(x);
}
}
class C extends P
{
int y=5;
public void display1()
{
System.out.println(y);
}
}
class inherits
{
public static void main(String args[])
{
C c = new C();
c.display1();
c.display();
}
}