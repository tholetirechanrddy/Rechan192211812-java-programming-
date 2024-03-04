import java.util.*;
class report
{
public static void main(String args[])
{
int i,regno,sum=0;
String name;
float avg=0;
int x[]=new int[5];
Scanner S=new Scanner(System.in);
System.out.println("Student Name:");
name=S.nextLine();
System.out.println("Reg.no:");
regno=S.nextInt();
for(i=0;i<5;i++)
{
System.out.println("Enter the marks in subject "+(i+1)+" =");
x[i]=S.nextInt();
}
for(i=0;i<5;i++)
{
if(x[i]>50)
{
sum+=x[i];
}
else
{
System.out.println("Failed in any one of the subject");
break;
}
}
for(i=0;i<5;i++)
{
sum+=x[i];
}
avg=sum/5;
if(avg>90)
{
System.out.println("Grade:S");
}
else if(avg>81 && avg<90)
{
System.out.println("Grade:A");
}
else if(avg>71 && avg<80)
{
System.out.println("Grade:B");
}
else if(avg>61 && avg<70)
{
System.out.println("Grade:C");
}
else if(avg>51 && avg<60)
{
System.out.println("Grade:D");
}
else if(avg <=50)
{
System.out.println("Grade:F");
}
else
{
System.out.println("Invalid");
}
}
}