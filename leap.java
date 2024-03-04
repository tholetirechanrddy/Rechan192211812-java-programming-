import java.util.*;
class leap
{
public static void main(String args[])
{
int year,rem;
System.out.println("Enter the year:");
Scanner S=new Scanner(System.in);
year=S.nextInt();
if((year%400==0) || ((year%4==0) && (year%100!=0)))
{
System.out.println("Given year is a leap year");
}
else
{
System.out.println("Not a leap year");
rem=year%4;
if(rem==3)
{
System.out.println("Next leap year "+(year+1));
}
else if(rem==2)
{
System.out.println("Next leap year "+(year+2));
}
else if(rem==1)
{
System.out.println("Next leap year "+(year+3));
}
else
{
System.out.println("Next leap year "+(year+4));
}
}
}
}
