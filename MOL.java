import java.util.*;
class method
{
int area(int x)
{
return x*x;
}
float area(float y)
{
return y*y;
}
float area(int x,float y)
{
return x*y;
}
float area(float a,float b)
{
return a*b;
}
}
class MOL
{
public static void main(String args[])
{
method m=new method();
System.out.println(m.area(10));
System.out.println(m.area(4.5f));
System.out.println(m.area(10,4.5f));
System.out.println(m.area(3.2f,4.5f));
}
}