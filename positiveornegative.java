import java.util.*;
class positiveornegative
{
public static void main(String args[])
{
int a;
System.out.println("Enter the number:");
Scanner S=new Scanner(System.in);
a=S.nextInt();
if(a>0)
{
System.out.println("Positive Number");
}
else if(a<0)
{
System.out.println("Negative Number");
}
else
{
System.out.println("Given number is zero");
}
}
}