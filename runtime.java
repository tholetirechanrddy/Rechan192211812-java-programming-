import java.util.*;
class A
{
public void display()
{
System.out.println("Base");
}
}
class B extends A
{
public void display()
{
System.out.println("Derived");
}
}
class runtime
{
public static void main(String args[])
{
B b=new B();
b.display();
A a=new A();
a.display();
}
}