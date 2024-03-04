import java.util.*;
class palindrome
{
public static void main(String args[])
{
String str,new_str="";
int choice,n,i,num,rev=0,rem,len;
System.out.println("Enter your choice:");
Scanner s=new Scanner(System.in);
choice=s.nextInt();
switch(choice)
{
case 1:
{
System.out.println("Enter the string:");
str=s.next();
len=str.length();
for(i=len-1;i>=0;i--)
{
new_str+=str.charAt(i);
}
if(str.equals(new_str))
{
System.out.println("String is a palindrome");
}
else
{
System.out.println("String is not a palindrome");
}
break;
}
case 2:
{
System.out.println("Enter the value:");
Scanner S=new Scanner(System.in);
n=S.nextInt();
int temp=n;
while(n !=0)
{
rem = n%10;
rev = rev*10+rem;
n/=10;
}
if(temp==rev)
{
System.out.println("Number is palindrome");
}
else
{
System.out.println("Number is not a palindrome");
}
break;
}
default:
{
System.out.println("Invalid input");
break;
}
}
}
}