import java.util.*;
class retstring
{
public static void main(String args[])
{
int n,i;
int arr[]=new int[100];
Scanner s=new Scanner(System.in);
System.out.println("Enter number of values:");
n=s.nextInt();
System.out.println("Enter the values:");
for(i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
if(arr[i]%3 == 0 && arr[i]%5 == 0)
{
System.out.println("Health is wealth");
}
else if(arr[i]%3==0)
{
System.out.println("Health");
}
else if(arr[i]%5==0)
{
System.out.println("Wealth");
}
else
{
System.out.println("Zero");
}
}
}
}