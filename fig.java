import java.util.*;
class staff
{
public void display()
{
int code=123;
String name="Navya";
System.out.println("Code:"+code);
System.out.println("Name:"+name);
}
}
class teacher extends staff
{
public void display1()
{
String subject="Java";
int pub=10;
System.out.println("Subject:"+subject);
System.out.println("Publications:"+pub);
}
}
class typist extends staff
{
public void display2()
{
int speed=120;
System.out.println("Speed:"+speed);
}
}
class officer extends staff
{
public void display3()
{
char grade='S';
System.out.println("Grade:"+grade);
}
}
class regular extends typist
{
public void display4()
{
int salary=10000;
System.out.println("Salary:"+salary);
}
}
class casual extends typist
{
public void display5()
{
int wages=500;
System.out.println("Daily wages:"+wages);
}
}
class fig
{
public static void main(String args[])
{
officer c = new officer();
c.display3();
c.display();
regular g = new regular();
g.display4();
g.display2();
casual m = new casual();
m.display5();
teacher k = new teacher();
k.display1();
}
}