import java.util.*;
class person
{
public void display()
{
int experience=15;
System.out.println("Experience:"+experience);
}
}
class account extends person
{
public void display1()
{
int pay,bonus;
System.out.print("Pay:");
Scanner s=new Scanner(System.in);
pay=s.nextInt();
System.out.println("Bonus:"+(pay*0.1));
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
int code=123;
String name="Navya";
System.out.println("Code:"+code);
System.out.println("Name:"+name);
}
}
class emp
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
