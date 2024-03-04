import java.util.*;
class person
{
public void display()
{
int code=123;
String name="Navya";
System.out.println("Code:"+code);
System.out.println("Name:"+name);
}
}
class account extends person
{
public void display1()
{
int pay=1200;
System.out.println("Pay:"+pay);
}
}
interface admin
{
public void display2();
}
class master extends account implements admin
{
public void display2()
{
int experience=15;
System.out.println("Experience:"+experience);
}
}
class network
{
public static void main(String args[])
{
System.out.println("master");
master m = new master();
m.display2();
m.display1();
m.display();
}
}
