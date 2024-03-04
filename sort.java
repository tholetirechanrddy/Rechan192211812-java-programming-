import java.util.*;
class sort
{
public static void main(String args[])
{
int i,j,n,temp;
System.out.println("Enter n value:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int x[]=new int[n];
for(i=0;i<n;i++)
{
x[i]=s.nextInt();
}
System.out.println("Array values before sorting:");
for(i=0;i<n;i++)
{
System.out.println(x[i]);
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(x[i] > x[j])
{
temp=x[i];
x[i]=x[j];
x[j]=temp;
}
}
}
System.out.println("Array values after sorting:");
for(i=0;i<n;i++)
{
System.out.println(x[i]);
}
}
}
