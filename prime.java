import java.util.*;
class prime
{
public static void main(String args[])
{
int i,j,flag,limit,x=0,n;
int prime[]=new int[100];
System.out.println("Enter the limit:");
Scanner s=new Scanner(System.in);
limit=s.nextInt();
for(i=1;i<=limit;i++)
{
flag=0;
for(j=1;j<=i/2;j++)
{
if(i%j==0)
{
flag++;
}
}
if(flag==1)
{
System.out.print(i+"\t");
prime[x]=i;
x++;
}
}
System.out.println(" ");
System.out.println("Number of prime numbers:"+x);
System.out.println("Enter n value:");
n=s.nextInt();
System.out.println(n+"th prime number:"+prime[n-1]);
}
}