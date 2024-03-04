import java.util.*;
class elecbill
{
public static void main(String args[])
{
int no,choice;
String name;
float cmr,lmr,units_consumed;
Scanner S=new Scanner(System.in);
System.out.println("Consumer Name:");
name=S.nextLine();
System.out.println("Consumer No:");
no=S.nextInt();
System.out.println("Current Month Reading:");
cmr=S.nextFloat();
System.out.println("Last Month Reading:");
lmr=S.nextFloat();
units_consumed=cmr-lmr;
System.out.println("Enter your choice:");
choice=S.nextInt();
switch(choice)
{
case 1:
{
System.out.println("Industry");
if(units_consumed<=100)
{
System.out.println("Rate:"+(units_consumed*0));
}
else if(units_consumed>101 &&units_consumed<200)
{
System.out.println("Rate:"+(units_consumed*1.25));
}
else if(units_consumed>201 &&units_consumed<300)
{
System.out.println("Rate:"+(units_consumed*2.5));
}
else if(units_consumed>301 &&units_consumed<500)
{
System.out.println("Rate:"+(units_consumed*4));
}
else if(units_consumed>500)
{
System.out.println("Rate:"+(units_consumed*5.40));
}
else
{
System.out.println("Invalid input");
}
break;
}
case 2:
{
System.out.println("Domestic");
if(units_consumed<=100)
{
System.out.println("Rate:"+(units_consumed*0));
}
else if(units_consumed>101 &&units_consumed<200)
{
System.out.println("Rate:"+(units_consumed*1));
}
else if(units_consumed>201 &&units_consumed<300)
{
System.out.println("Rate:"+(units_consumed*2));
}
else if(units_consumed>301 &&units_consumed<500)
{
System.out.println("Rate:"+(units_consumed*3.5));
}
else if(units_consumed>500)
{
System.out.println("Rate:"+(units_consumed*5));
}
else
{
System.out.println("Invalid input");
}
break;
}
default:
{
System.out.println("Invalid");
}
}
}
}
