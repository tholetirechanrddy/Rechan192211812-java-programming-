import java.util.*;
class ariopr
{
public static void main(String args[])
{
int a,b,c;
System.out.println("Enter number 1:");
Scanner S=new Scanner(System.in);
a=S.nextInt();
System.out.println("Enter number 2:");
b=S.nextInt();
System.out.println("Enter your choice:");
c=S.nextInt();
switch(c)
{
case 1:
System.out.println("Addition="+(a+b));
break;
case 2:
System.out.println("Subraction="+(a-b));
break;
case 3:
System.out.println("Multiplication="+(a*b));
break;
case 4:
System.out.println("Division="+(a/b));
break;
case 5:
System.out.println("Modulus="+(a%b));
break;
default:
System.out.println("Invalid input");
}
}
}