import java.util.*;
class student
{
public void display()
{
int roll_no=123;
System.out.println("Roll No:"+roll_no);
}
}
class test extends student
{
public void display1()
{
int a=45,b=67,c=90,d=76,e=87;
System.out.println("Marks of all the 5 subjects");
System.out.println("Subject 1:"+a);
System.out.println("Subject 2:"+b);
System.out.println("Subject 3:"+c);
System.out.println("Subject 4:"+d);
System.out.println("Subject 5:"+e);
}
}
class result extends test
{
public void display2()
{
int sum=a+b+c+d+e;
System.out.println("Result:"+sum);
}
}
class multi
{
public static void main(String args[])
{
result p=new result();
p.display2();
p.display1();
p.display();
}
}