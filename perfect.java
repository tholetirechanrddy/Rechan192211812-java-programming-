import java.util.*;
class perfect
{
public static void main(String args[])
{
int i,n,sum=0;
System.out.println("Enter the number:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(sum==n)
{
System.out.println("Given number is a perfect number");
}
else
{
System.out.println("Given number is not a perfect number");
}
}
}