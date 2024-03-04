import java.util.*;
class atm
{
public static void main(String args[])
{
int q,r,s,t,m,n,o,p;
Scanner S=new Scanner(System.in)
System.out.println("Enter 1st denomination:");
t=S.nextInt();
System.out.println("Number of notes:");
m=S.nextInt();
System.out.println("Enter 2nd denomination:");
q=S.nextInt();
System.out.println("Number of notes:");
n=S.nextInt();
System.out.println("Enter 3rd denomination:");
r=S.nextInt();
System.out.println("Number of notes:");
o=S.nextInt();
System.out.println("Enter 4th denomination:");
s=S.nextInt();
System.out.println("Number of notes:");
p=S.nextInt();
if(q==2000 && r==500 && s==200 && t==100)
{
int Total=(t*m)+(q*n)+(r*o)+(s*p);
System.out.println("Total amount:"+Total);
}
else
{
System.out.println("Invalid Denomination");
}
}
}