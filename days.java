import java.util.*;
class days
{
public static void main(String args[])
{
int m,year,month,week,day;
System.out.println("Enter the number of days:");
Scanner s=new Scanner(System.in);
m=s.nextInt();
year = m / 365;
System.out.println("Years:"+year);
m=m%365;
month = m / 30;
System.out.println("Month:"+month);
m=m%30;
week = m / 7;
System.out.println("Weeks:"+week);
day = m%7;
System.out.println("Days:"+day);
}
}