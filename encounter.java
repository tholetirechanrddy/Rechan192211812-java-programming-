import java.util.*;
class encounter
{
public static void main(String args[])
{
int i,sumn=0,sump=0,p=0,l=0;
double avgp=0,avgn=0;
Scanner s=new Scanner(System.in);
int arr[]=new int[20];
for(i=0;i<20;i++)
{
arr[i]=s.nextInt();
if(arr[i]==-1)
{
break;
}
else
{
if(arr[i]>0)
{
sump+=arr[i];
p++;
}
else
{
sumn+=arr[i];
l++;
}
}
}
avgp=sump/p;
avgn=sumn/l;
System.out.println("Average of positive numbers:"+avgp);
System.out.println("Average of negative numbers:"+avgn);
}
}