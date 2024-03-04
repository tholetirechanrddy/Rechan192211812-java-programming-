import java.util.*;
class arithmetic
{
public static void main(String args[])
{
int a,b;
float c;
Scanner S=new Scanner(System.in);
a=S.nextInt();
b=S.nextInt();
c=a+b;
System.out.println("Addition:"+c);
c=a-b;
System.out.println("Subraction:"+c);
c=a*b;
System.out.println("Multiplication:"+c);
c=a/b;
System.out.println("Division:"+c);
c=a%b;
System.out.println("Modulus:"+c);
}
}
