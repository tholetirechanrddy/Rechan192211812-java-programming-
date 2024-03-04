import java.util.*;
class max
{
public static void main(String args[])
{
int i,j,n,temp;
System.out.println("Enter n value:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int x[]=new int[n];
System.out.println("Enter elements:");
for(i=0;i<n;i++)
{
x[i]=s.nextInt();
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
System.out.println("Maximum element:"+x[n-1]);
System.out.println("Second Maximum element:"+x[n-2]);
System.out.println("Minimum element:"+x[0]);
}
}