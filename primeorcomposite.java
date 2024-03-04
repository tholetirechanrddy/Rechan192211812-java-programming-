import java.util.*;
class primeorcomposite
{
public static void main(String args[])
{
int i,j,fac=0,a,countp=0,countc=0,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the limit:");
n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter the values:");
for(i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
fac=0;
a=arr[i];
for(j=1;j<=a;j++)
{
if(a%j==0)
{
fac++;
}
}
if(fac==2)
{
countp++;
}
else
{
countc++;
}
}
System.out.println("Count of composite numbers:"+countc);
System.out.println("Count of prime numbers:"+countp);
}
}