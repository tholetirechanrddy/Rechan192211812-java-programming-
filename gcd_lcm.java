import java.util.*;
class gcd_lcm
{
public static void main(String args[])
{
int i,n,lcm,gcd;
Scanner S=new Scanner(System.in);
System.out.println("Enter n value:");
n=S.nextInt();
int x[]=new int[n];
System.out.println("Enter the elements:");
for(i=0;i<n;i++)
{
x[i]=S.nextInt();
}
lcm=lcm_cal(x[0],x[1]);
for(i=2;i<n;i++)
{
lcm=lcm_cal(lcm,x[i]);
}
System.out.println("LCM:"+lcm);
gcd=x[0];
for(i=1;i<x.length;i++)
{
gcd=gcd_cal(gcd,x[i]);
}
System.out.println("GCD:"+gcd);
}
static int lcm_cal(int a,int b)
{
int temp,i=2,res;
if(a>b)
{
res=a;
}
else
{
res=b;
}
temp=res;
while(res%a!=0 || res%b!=0)
{
res=temp*i;
i++;
}
return res;
}
static int gcd_cal(int a,int b)
{
while(b>0)
{
int temp;
temp=b;
b=a%b;
a=temp;
}
return a;
}
}