import java.util.*;
class duplicate
{
public static void main(String args[])
{
int i,j,n,temp;
Scanner s=new Scanner(System.in);
System.out.println("Enter limit:");
n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter the values:");
for(i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("Non-Duplicate Items:");
for(i=0;i<n;i++)
{
if(arr[i]!=arr[i+1])
{
System.out.println(arr[i]);
}
}
}
}