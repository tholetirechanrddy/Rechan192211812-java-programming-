import java.util.*;
class factor
{
public static void main(String args[])
{
int num,n,x=0,i;
int fac[]=new int[50];
System.out.println("Enter the number:");
Scanner s=new Scanner(System.in);
num=s.nextInt();
for(i=1;i<=num;i++)
{
if(num%i==0)
{
fac[x]=i;
x++;
}
}
System.out.println("Number of factors:"+x);
System.out.println("Enter n value:");
n=s.nextInt();
System.out.println(n+"th factor value is:"+(fac[n-1]));
}
}
